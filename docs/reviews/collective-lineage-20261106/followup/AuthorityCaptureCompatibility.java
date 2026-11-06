package org.integratedmodelling.klab.services.reasoner.internal;

import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.core.type.TypeReference;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.Worldview;

/** Private read adapter: original proof/source bytes remain untouched and hash-verified. */
public final class AuthorityCaptureCompatibility {
  static int removed;
  static final Map<String,Integer> removedFields=new TreeMap<>();
  static void strip(JsonNode node) {
    if (node.isObject()) {
      var object=(ObjectNode)node;
      if (object.path("@CLASS").asText().equals("org.integratedmodelling.klab.api.lang.kim.impl.KimConceptStatementImpl")) {
        var fields=new HashSet<String>();
        for (Class<?> c=org.integratedmodelling.klab.api.lang.kim.impl.KimConceptStatementImpl.class;c!=null;c=c.getSuperclass())
          for(var field:c.getDeclaredFields())fields.add(field.getName());
        var names=new ArrayList<String>();object.fieldNames().forEachRemaining(names::add);
        for(var name:names)if(!name.equals("@CLASS")&&!fields.contains(name)) {
          var value=object.get(name);
          if (!(value.isArray()&&value.isEmpty()))
            throw new IllegalStateException("Unsupported nonempty obsolete field: "+name+"="+value);
          object.remove(name);removed++;removedFields.merge(name,1,Integer::sum);
        }
      }
      object.elements().forEachRemaining(AuthorityCaptureCompatibility::strip);
    } else if (node.isArray()) node.elements().forEachRemaining(AuthorityCaptureCompatibility::strip);
  }
  public static CapturedAuthorityCatalog read(Path data) throws Exception {
    var plain=new ObjectMapper();var state=data.resolve("captured-authority-state");
    byte[] source=Files.readAllBytes(state.resolve("source.json"));
    var proof=plain.readTree(Files.readAllBytes(state.resolve("proof.json")));
    String hash=HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(source));
    if (!hash.equals(proof.path("inputSha256").asText())) throw new IllegalStateException("Original source/proof hash mismatch");
    var tree=plain.readTree(source);removed=0;removedFields.clear();strip(tree);
    var world=JacksonConfiguration.newObjectMapper().readValue(plain.writeValueAsBytes(tree),Worldview.class);
    var bindings=plain.convertValue(proof.get("authorityVersions"),new TypeReference<Map<String,Long>>(){});
    var evidence=plain.convertValue(proof.get("providerEvidence"),new TypeReference<Map<String,CapturedAuthorityCatalog.ProviderEvidence>>(){});
    var snapshots=proof.has("configuredSnapshots")?plain.convertValue(proof.get("configuredSnapshots"),new TypeReference<Map<String,String>>(){}):Map.<String,String>of();
    System.out.println("COMPATIBILITY_READER original_source_sha256="+hash+" removed_empty_fields="+removedFields);
    return CapturedAuthorityCatalog.captureRecorded(data,world,bindings,evidence,snapshots);
  }
}

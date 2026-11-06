import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import com.fasterxml.jackson.databind.*;
import org.integratedmodelling.klab.api.services.ConfiguredAuthoritySnapshot;
public class AuditSnapshotSerialization {
 public static void main(String[] args)throws Exception {
  var mapper=new ObjectMapper().enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
  var tree=mapper.readTree(Files.readAllBytes(Path.of(args[0])));var results=new ArrayList<Map<String,Object>>();
  var entries=tree.path("configuredSnapshots").fields();
  while(entries.hasNext()) {
   var entry=entries.next();var snapshot=mapper.treeToValue(entry.getValue().get("snapshot"),ConfiguredAuthoritySnapshot.class);
   byte[] canonical=mapper.writeValueAsBytes(snapshot);
   String hash=HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(canonical));
   var row=new LinkedHashMap<String,Object>();row.put("name",entry.getKey());row.put("storedRawContentHash",entry.getValue().path("contentSha256").asText());
   row.put("currentTypedCanonicalHash",hash);row.put("checksumMatches",hash.equals(entry.getValue().path("contentSha256").asText()));
   row.put("jsonValueUnchanged",mapper.readTree(canonical).equals(entry.getValue().get("snapshot")));
   row.put("typedCanonicalPrefix",new String(canonical,java.nio.charset.StandardCharsets.UTF_8).substring(0,280));results.add(row);
  }
  Files.write(Path.of(args[1]),mapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(results));System.out.println(results);
 }
}

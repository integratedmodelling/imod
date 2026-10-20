package org.integratedmodelling.klab.services.resources.storage;
import java.nio.file.*;
import java.lang.reflect.*;
import java.util.*;
import org.integratedmodelling.klab.api.knowledge.impl.WorldviewImpl;
import org.integratedmodelling.klab.api.knowledge.organization.Project;
import org.integratedmodelling.klab.api.knowledge.organization.ProjectStorage;
import org.integratedmodelling.klab.api.lang.kim.*;
import org.integratedmodelling.klab.api.scope.Scope;
import org.integratedmodelling.klab.api.services.runtime.Notification;
import org.integratedmodelling.klab.services.resources.ResourcesProvider;
import org.integratedmodelling.klab.services.resources.storage.WorkspaceManager;
import org.integratedmodelling.klab.runtime.language.WorldviewValidationScope;
import org.integratedmodelling.klab.services.reasoner.internal.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import static org.mockito.Mockito.*;

/** Uses actual captured ontology bytes. Only service/storage lifecycle boundaries are mocked. */
public class M49CompositionSourceLoader {
  public static WorkspaceManager lastManager;
  @com.fasterxml.jackson.annotation.JsonIgnoreProperties("updateable")
  private abstract static class ComponentWireMixin {}
  static void set(Object target, String name, Object value) throws Exception {
    var field=WorkspaceManager.class.getDeclaredField(name); field.setAccessible(true); field.set(target,value);
  }
  static List<Map<String,Object>> notifications(Collection<Notification> notifications) {
    var result=new ArrayList<Map<String,Object>>();
    for(var n:notifications) {
      var item=new LinkedHashMap<String,Object>();
      item.put("level",n.getLevel().toString()); item.put("message",n.getMessage());
      if(n.getLexicalContext()!=null) item.put("lexicalContext",n.getLexicalContext());
      result.add(item);
    }
    return result;
  }
  static Map<String,Object> declaration(KimConceptStatement statement) {
    var result=new LinkedHashMap<String,Object>();
    result.put("urn",statement.getUrn()); result.put("type",statement.getType());
    result.put("coreAlias",statement.getUpperConceptDefined());
    result.put("parent",statement.getDeclaredParent()==null?null:statement.getDeclaredParent().getUrn());
    result.put("describes",statement.getObservablesDescribed().stream().map(p->Map.of("target",p.getFirst().getUrn(),"kind",p.getSecond().toString())).toList());
    result.put("children",statement.getChildren().stream().map(M49CompositionSourceLoader::declaration).toList());
    return result;
  }
  public static WorldviewImpl load(Path source,List<org.integratedmodelling.klab.api.services.runtime.extension.Extensions.ComponentDescriptor> components)throws Exception {
    var report=new LinkedHashMap<String,Object>();
      var manager=mock(WorkspaceManager.class,CALLS_REAL_METHODS);
      var service=mock(ResourcesProvider.class); when(service.serviceId()).thenReturn("isolated-validation");
      set(manager,"service",service); set(manager,"scope",mock(Scope.class));
      set(manager,"ontologyParser",new WorkspaceManager.OntologyParser());
      var strategyType=Class.forName(WorkspaceManager.class.getName()+"$StrategyParser");var strategyCtor=strategyType.getDeclaredConstructor(WorkspaceManager.class);strategyCtor.setAccessible(true);set(manager,"strategyParser",strategyCtor.newInstance(manager));
      set(manager,"documentURLs",new HashMap<>()); set(manager,"_ontologyMap",new HashMap<>());
      set(manager,"languageValidationScope",new WorldviewValidationScope());
      var storage=mock(ProjectStorage.class); var urls=new ArrayList<java.net.URL>();
      try(var files=Files.list(source)) {
        for(var file:files.filter(p->p.toString().endsWith(".kwv")).sorted().toList()) urls.add(file.toUri().toURL());
      }
      report.put("inputCount",urls.size());
      when(storage.listResources(ProjectStorage.ResourceType.ONTOLOGY)).thenReturn(urls);
      var strategyUrls=new ArrayList<java.net.URL>();try(var files=Files.list(source)){for(var file:files.filter(p->p.toString().endsWith(".obs")).sorted().toList())strategyUrls.add(file.toUri().toURL());}
      when(storage.listResources(ProjectStorage.ResourceType.STRATEGY)).thenReturn(strategyUrls);
      var manifest=mock(Project.Manifest.class); when(manifest.getDefinedWorldview()).thenReturn("imod");
      var descriptorType=Class.forName(WorkspaceManager.class.getName()+"$ProjectDescriptor");
      var ctor=descriptorType.getDeclaredConstructor(WorkspaceManager.class); ctor.setAccessible(true);
      var descriptor=ctor.newInstance(manager);
      for(var entry:Map.of("name","imod","storage",storage,"manifest",manifest).entrySet()) {
        var field=descriptorType.getDeclaredField(entry.getKey()); field.setAccessible(true); field.set(descriptor,entry.getValue());
      }
      set(manager,"projectDescriptors",new HashMap<>(Map.of("imod",descriptor)));
      lastManager = manager;
      var loaded=manager.getOntologies(false);
      report.put("loadedCount",loaded.size()); report.put("dependencyOrder",loaded.stream().map(KimOntology::getUrn).toList());
      var documents=new ArrayList<Map<String,Object>>();
      for(var ontology:loaded) {
        var item=new LinkedHashMap<String,Object>(); item.put("urn",ontology.getUrn());
        item.put("sourceHash",org.integratedmodelling.klab.api.services.reasoner.objects.SemanticValidationRequest.sourceHash(ontology.getSourceCode()));
        item.put("imports",ontology.getImportedOntologies()); item.put("owlImports",ontology.getOwlImports());
        item.put("domain",ontology.getDomain()==null?null:ontology.getDomain().getUrn());
        item.put("declarations",ontology.getStatements().stream().map(M49CompositionSourceLoader::declaration).toList());
        item.put("notifications",notifications(ontology.getNotifications())); documents.add(item);
      }
      report.put("documents",documents);
      if(loaded.size()!=urls.size()) throw new IllegalStateException("Loader omitted source documents");
      var worldview=new WorldviewImpl(); worldview.setUrn("imod"); worldview.setWorldviewId("imod");
      worldview.setEmpty(false); worldview.setOntologies(new ArrayList<>(loaded)); worldview.setObservationStrategies(new ArrayList<>(manager.getStrategyDocuments()));if(worldview.getObservationStrategies().size()!=2)throw new AssertionError("Expected 2 strategy documents");

    org.integratedmodelling.klab.services.resources.lang.WorldviewAuthorityValidator.validate(worldview,components);
    return worldview;
  }
}

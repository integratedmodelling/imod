package org.integratedmodelling.klab.services.reasoner.internal;
import java.nio.file.*;
import java.util.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.SemanticType;
import org.integratedmodelling.klab.api.lang.kim.KimNamespace;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;
public class WaterWorldCheck {
 static final Map<String,Object> checks=new LinkedHashMap<>();
 static void check(String id,boolean ok){checks.put(id,ok);if(!ok)throw new AssertionError(id);}
 public static void main(String[] args)throws Exception {
  M49FixtureAudit.install();var root=Path.of(args[0]);var capture=Path.of(args[1]);
  var json=JacksonConfiguration.newObjectMapper();var catalog=CapturedAuthorityCatalog.capture(capture);
  var world=M49CompositionSourceLoader.load(root.resolve("flat-source"),catalog.components());
  check("26 ontologies and two strategy documents",world.getOntologies().size()==26&&world.getObservationStrategies().size()==2);
  for(var ontology:world.getOntologies())for(var n:ontology.getNotifications())check("source "+ontology.getUrn()+" "+n.getMessage(),n.getLevel().severity<3);
  var factory=SemanticEnvironmentFactory.fromLocalCatalog(root.resolve("run/assets"),Files.createDirectories(root.resolve("run/empty-catalog")),capture);
  var input=factory.capture(world);var built=factory.build(input,()->false);
  var result=new LinkedHashMap<String,Object>();result.put("baseline","db209f9dbbbe59b9be2dc85008732b2805600419");result.put("beanStatus",input.beanStatus());result.put("logicalStatus",built.logicalStatus());result.put("diagnostics",built.diagnostics());
  Files.write(root.resolve("RESULTS.json"),json.writerWithDefaultPrettyPrinter().writeValueAsBytes(result));
  check("bean valid",input.beanStatus().toString().equals("VALID"));check("logical valid",built.logicalStatus().toString().equals("VALID"));
  if(built.state()==null)throw new AssertionError(result);
  try(var state=built.state()) {
   var actor=state.actor();
   if(Files.exists(root.resolve("water-candidate.flag"))) {
    var water=actor.resolveConcept("earth:Water");var body=actor.resolveConcept("physical:MaterialBody");
    var subsurface=actor.resolveConcept("earth:SubsurfaceWater");var ground=actor.resolveConcept("earth:Groundwater");
    var surface=actor.resolveConcept("earth:SurfaceWater");var sea=actor.resolveConcept("earth:Seawater");
    var parcel=actor.resolveConcept("physics:FluidParcel");var geo=actor.resolveConcept("earth:WaterBody");
    check("material water inherits MaterialBody",actor.is(water,body));
    for(var name:List.of("earth:SubsurfaceWater","earth:Groundwater","earth:SurfaceWater","earth:Seawater"))
      check(name+" matches shared Water parent",actor.is(actor.resolveConcept(name),water));
    check("Groundwater inherits broader SubsurfaceWater",actor.is(ground,subsurface));
    check("geographic WaterBody not inferred Water material",!actor.is(geo,water));
    check("Water material not inferred geographic WaterBody",!actor.is(water,geo));
    check("generic water not required FluidParcel",!actor.is(water,parcel));
    check("Seawater not required FluidParcel",!actor.is(sea,parcel));
    check("Seawater not inferred SurfaceWater",!actor.is(sea,surface));
    check("SurfaceWater not inferred Seawater",!actor.is(surface,sea));
    check("SubsurfaceWater not inferred Groundwater",!actor.is(subsurface,ground));
    check("Groundwater not automatically Seawater",!actor.is(ground,sea));
    check("shared transfer relationship resolves",actor.resolveConcept("hydrology:TransfersWaterTo")!=null);
   }
check("OWL consistent",actor.owl().isConsistent());
   var unsat=actor.owl().getUnsatisfiableClasses().entities().filter(c->!c.isOWLNothing()).map(Object::toString).toList();result.put("unsatisfiable",unsat);check("no unsatisfiable classes",unsat.isEmpty());
   var functional=actor.resolveConcept("earth:StreamConnection");var structural=actor.resolveConcept("life:SocialConnection");
   var destination=actor.owl().getOntology("earth");
   var union=actor.owl().getUnion(List.of(functional,structural),destination,functional.getType());
   check("materialized union retains only common axes",union.is(SemanticType.UNIDIRECTIONAL)&&!union.is(SemanticType.FUNCTIONAL)&&!union.is(SemanticType.STRUCTURAL));
   check("boolean union permits existing structural branch",actor.owl().permitsRelationshipAxes(union,new org.integratedmodelling.klab.api.knowledge.RelationshipAxes(org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Nature.STRUCTURAL,org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Orientation.DIRECTED)));
   check("boolean union rejects absent bond orientation",!actor.owl().permitsRelationshipAxes(union,new org.integratedmodelling.klab.api.knowledge.RelationshipAxes(org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Nature.STRUCTURAL,org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Orientation.BOND)));
   union.getType().add(SemanticType.FUNCTIONAL);
   var cached=actor.owl().getUnion(List.of(structural,functional),destination,structural.getType());
   check("cached union axes recomputed",cached==union&&!cached.is(SemanticType.FUNCTIONAL)&&!cached.is(SemanticType.STRUCTURAL));
   var booleanOntology=destination.getOWLOntology();
   var booleanManager=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();
   var booleanExport=booleanManager.createOntology(booleanOntology.getAxioms());var booleanFile=root.resolve("boolean-axes.owl");
   booleanManager.saveOntology(booleanExport,org.semanticweb.owlapi.model.IRI.create(booleanFile.toUri()));
   var fresh=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager().loadOntologyFromOntologyDocument(booleanFile.toFile());
   var unionClass=fresh.classesInSignature().filter(c->fresh.subClassAxiomsForSubClass(c).anyMatch(a->a.getSuperClass() instanceof org.semanticweb.owlapi.model.OWLObjectUnionOf)).filter(c->fresh.annotationAssertionAxioms(c.getIRI()).anyMatch(a->a.getProperty().getIRI().toString().endsWith("effectiveOrientation"))).findFirst().orElseThrow();
   var restored=org.integratedmodelling.klab.services.reasoner.owl.RelationshipOntologySupport.read(unionClass,List.of(fresh));
   check("fresh boolean import retains common directed orientation",restored.orientation()==org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Orientation.DIRECTED);
   check("boolean export does not fabricate authored choices",fresh.annotationAssertionAxioms(unionClass.getIRI()).noneMatch(a->a.getProperty().getIRI().toString().contains("declaredOrientation")));
   boolean conflict=false;try{actor.owl().getIntersection(List.of(functional,structural),destination,functional.getType());}catch(IllegalArgumentException expected){conflict=true;}
   check("materialized opposite intersection rejected",conflict);
   for(String name:List.of("earth:StreamConnection","life:SocialConnection")) {
    var concept=actor.resolveConcept(name);
    check(name+" effective directed",concept.is(SemanticType.UNIDIRECTIONAL)&&!concept.is(SemanticType.BIDIRECTIONAL));
    var namespace=name.substring(0,name.indexOf(':'));var ontology=actor.owl().getOntology(namespace).getOWLOntology();
    var manager=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();
    var exported=manager.createOntology(ontology.getAxioms());
    var file=root.resolve(namespace+"-axes.owl");manager.saveOntology(exported,org.semanticweb.owlapi.model.IRI.create(file.toUri()));
    var reader=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();var reloaded=reader.loadOntologyFromOntologyDocument(file.toFile());
    var cls=reloaded.classesInSignature().filter(c->c.getIRI().getShortForm().equals(name.substring(name.indexOf(':')+1))).findFirst().orElseThrow();
    var axes=org.integratedmodelling.klab.services.reasoner.owl.RelationshipOntologySupport.read(cls,List.of(reloaded));
    check(name+" exported axes retained",axes!=null&&axes.orientation()==org.integratedmodelling.klab.api.knowledge.RelationshipAxes.Orientation.DIRECTED);
    check(name+" declared orientation retained",reloaded.annotationAssertionAxioms(cls.getIRI()).anyMatch(a->a.getProperty().getIRI().toString().endsWith("declaredOrientation")&&a.getValue().toString().contains("DIRECTED")));
   }
   var leaf=actor.resolveConcept("land.corine:BroadLeavedForest");var forest=actor.resolveConcept("land.corine:Forest");
   check("LAND inclusion retained",actor.is(leaf,forest));check("LAND reverse not inferred",!actor.is(forest,leaf));
   check("LAND distance retained",actor.authoritySemanticDistance(forest,leaf).distance()==1);
   var manager=M49CompositionSourceLoader.lastManager;
   var type=Class.forName("org.integratedmodelling.klab.services.resources.storage.WorkspaceManager$KimParser");
   var ctor=type.getDeclaredConstructor();ctor.setAccessible(true);var managerType=Class.forName("org.integratedmodelling.klab.services.resources.storage.WorkspaceManager");var field=managerType.getDeclaredField("namespaceParser");field.setAccessible(true);field.set(manager,ctor.newInstance());
   var parse=managerType.getDeclaredMethod("readNamespace",String.class,long.class,String.class,String.class);parse.setAccessible(true);
   String positive=Files.readString(root.resolve("model-example.kim"));
   var ns=(KimNamespace)parse.invoke(manager,positive,1L,"imod","examples.articulation.measure");
   check("positive model parsed exactly once",ns!=null&&ns.getStatements().size()==1);check("positive model source clean",ns.getNotifications().stream().noneMatch(n->n.getLevel().severity>=3));
   var diagnostics=new DocumentSemanticValidator(actor).validate(ns);result.put("positiveModelDiagnostics",diagnostics);check("work duration model accepted",diagnostics.stream().noneMatch(n->n.getLevel().severity>=3));
  }
  check("zero network attempts",M49FixtureAudit.denied.isEmpty());result.put("checks",checks);Files.write(root.resolve("RESULTS.json"),json.writerWithDefaultPrettyPrinter().writeValueAsBytes(result));System.out.println("PASS "+checks.size()+" checks; 26 ontologies; offline");
 }
}
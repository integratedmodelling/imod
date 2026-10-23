package org.integratedmodelling.klab.services.reasoner.internal;
import java.nio.file.*;
import java.util.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.integratedmodelling.klab.services.reasoner.owl.ObservationalContainmentSupport;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.SemanticType;
import org.integratedmodelling.klab.api.lang.kim.KimNamespace;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;
public class ChemicalAliasCombinedCheck {
 static org.semanticweb.owlapi.model.OWLClass cls(org.integratedmodelling.klab.services.reasoner.owl.OWL o,org.integratedmodelling.klab.api.knowledge.Concept c)throws Exception {var m=o.getClass().getDeclaredMethod("getOWLClass",org.integratedmodelling.klab.api.knowledge.Concept.class);m.setAccessible(true);return (org.semanticweb.owlapi.model.OWLClass)m.invoke(o,c);}
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
  var result=new LinkedHashMap<String,Object>();result.put("baseline","7c372b74a378a0b0cfb91962e87263018017d0ca");result.put("beanStatus",input.beanStatus());result.put("logicalStatus",built.logicalStatus());result.put("diagnostics",built.diagnostics());
  Files.write(root.resolve("RESULTS.json"),json.writerWithDefaultPrettyPrinter().writeValueAsBytes(result));
  check("bean valid",input.beanStatus().toString().equals("VALID"));check("logical valid",built.logicalStatus().toString().equals("VALID"));
  if(built.state()==null)throw new AssertionError(result);
  try(var state=built.state()) {
   var actor=state.actor();
   { var owl=actor.owl();
    var rootGroup=actor.resolveConcept("life:Assemblage");var organism=actor.resolveConcept("life:Individual");var population=actor.resolveConcept("ecology:Population");var community=actor.resolveConcept("ecology:Community");
    check("existing Assemblage remains abstract Subject",rootGroup.is(SemanticType.SUBJECT)&&rootGroup.is(SemanticType.ABSTRACT)&&!rootGroup.is(SemanticType.AGENT));
    check("existing organism and ecological Agents retained",organism.is(SemanticType.AGENT)&&population.is(SemanticType.AGENT)&&community.is(SemanticType.AGENT));
    {
     var cell=actor.resolveConcept("life:CellularBody");var anatomical=actor.resolveConcept("life:AnatomicalAssemblage");var group=actor.resolveConcept("life:CellAssemblage");
     check("cell concrete MaterialBody Subject",cell.is(SemanticType.SUBJECT)&&!cell.is(SemanticType.ABSTRACT)&&actor.is(cell,actor.resolveConcept("physical:MaterialBody")));
     check("anatomical intermediate abstract Subject under Assemblage",anatomical.is(SemanticType.SUBJECT)&&anatomical.is(SemanticType.ABSTRACT)&&actor.is(anatomical,rootGroup));
     check("cell grouping concrete under anatomical intermediate",group.is(SemanticType.SUBJECT)&&!group.is(SemanticType.ABSTRACT)&&actor.is(group,anatomical));
     check("cell grouping inherits shared Assemblage",actor.is(group,rootGroup));check("no reverse broad-to-narrow inference",!actor.is(rootGroup,anatomical)&&!actor.is(anatomical,group));
     check("no new group retyped organism or collective Agent",!actor.is(group,organism)&&!actor.is(anatomical,organism)&&!actor.is(group,actor.resolveConcept("life:CollectiveAgent")));
     check("no ecological Agent ancestry introduced",!actor.is(group,population)&&!actor.is(group,community)&&!actor.is(population,group)&&!actor.is(community,group));
     var f=owl.getClass().getDeclaredField("reasoner");f.setAccessible(true);var dl=(OWLReasoner)f.get(owl);var df=dl.getRootOntology().getOWLOntologyManager().getOWLDataFactory();
     check("group and ecological Agent intersection unsatisfiable",!dl.isSatisfiable(df.getOWLObjectIntersectionOf(cls(owl,group),cls(owl,population))));
     for(var c:List.of(rootGroup,anatomical,group,cell)){
      check(c.getUrn()+" has no native bearer",actor.inherent(c)==null);
      check(c.getUrn()+" has no observational containment contract",ObservationalContainmentSupport.declarationsForContainer(owl,c).isEmpty());
      check(c.getUrn()+" has no created observables",actor.created(c).isEmpty());
     }

    }

   }
   if(Files.exists(root.resolve("alias-candidate.flag"))) {
   var alias=actor.resolveConcept("chemistry:Water");var canonical=actor.resolveConcept("CHEM:CID_962");
   var environment=actor.resolveConcept("earth:Water");var identityRoot=actor.resolveConcept("chemistry:ChemicalIdentity");
   check("chemical Water alias resolves",alias!=null&&canonical!=null);
   check("chemical Water has Identity type",alias.is(SemanticType.IDENTITY));
   check("chemical Water not Subject type",!alias.is(SemanticType.SUBJECT));
   check("chemical Water inherits configured ChemicalIdentity root",actor.is(alias,identityRoot));
   check("equals alias and authority are mutually substitutable",actor.is(alias,canonical)&&actor.is(canonical,alias));
   check("chemical alias satisfiable",actor.owl().isSatisfiable(alias));
   check("environmental Water remains Subject",environment.is(SemanticType.SUBJECT));
   check("chemical Water not environmental material",!actor.is(alias,environment));
   check("environmental Water not chemical identity alias",!actor.is(environment,alias));
   var classMethod=actor.owl().getClass().getDeclaredMethod("getOWLClass",org.integratedmodelling.klab.api.knowledge.Concept.class);classMethod.setAccessible(true);
   var aliasClass=(org.semanticweb.owlapi.model.OWLClass)classMethod.invoke(actor.owl(),alias);
   var canonicalClass=(org.semanticweb.owlapi.model.OWLClass)classMethod.invoke(actor.owl(),canonical);
   var environmentalClass=(org.semanticweb.owlapi.model.OWLClass)classMethod.invoke(actor.owl(),environment);
   var identityClass=(org.semanticweb.owlapi.model.OWLClass)classMethod.invoke(actor.owl(),identityRoot);
   check("alias uses canonical OWL class rather than child class",aliasClass.equals(canonicalClass));
   check("chemical and environmental OWL identifiers differ",!aliasClass.equals(environmentalClass));
   var conceptWire=json.writeValueAsBytes(alias);Files.write(root.resolve("chemical-alias-concept.json"),conceptWire);
   var restoredConcept=json.readValue(conceptWire,org.integratedmodelling.klab.api.knowledge.Concept.class);
   check("Concept interface roundtrip preserves Identity",restoredConcept.is(SemanticType.IDENTITY));
   check("Concept interface roundtrip preserves canonical URN",restoredConcept.getUrn().equals(alias.getUrn()));
   var axioms=new java.util.HashSet<org.semanticweb.owlapi.model.OWLAxiom>();
   for(var o:actor.owl().getOntology().getOWLOntology().getImportsClosure())axioms.addAll(o.getAxioms());
   var manager=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();var export=manager.createOntology(axioms);
   var file=root.resolve("chemical-water-world-roundtrip.owl");manager.saveOntology(export,org.semanticweb.owlapi.model.IRI.create(file.toUri()));
   var freshManager=org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();var fresh=freshManager.loadOntologyFromOntologyDocument(file.toFile());
   check("fresh OWL contains chemical canonical class",fresh.containsClassInSignature(canonicalClass.getIRI()));
   check("fresh OWL contains distinct environmental class",fresh.containsClassInSignature(environmentalClass.getIRI()));
   var freshReasoner=new org.semanticweb.HermiT.Reasoner.ReasonerFactory().createReasoner(fresh);
   try {
    check("fresh OWL roundtrip consistent",freshReasoner.isConsistent());
    check("fresh OWL chemical canonical class satisfiable",freshReasoner.isSatisfiable(canonicalClass));
    check("fresh OWL preserves ChemicalIdentity inheritance",freshReasoner.isEntailed(freshManager.getOWLDataFactory().getOWLSubClassOfAxiom(canonicalClass,identityClass)));
    check("fresh OWL does not equate chemical and environmental Water",!freshReasoner.isEntailed(freshManager.getOWLDataFactory().getOWLEquivalentClassesAxiom(canonicalClass,environmentalClass)));
   }finally {freshReasoner.dispose();}
   result.put("chemicalAlias",Map.of("sourceAlias","chemistry:Water","canonical",canonical.getUrn(),"canonicalOWL",canonicalClass.getIRI().toString(),"environmentalOWL",environmentalClass.getIRI().toString(),"semantics","Runtime alias delegates to canonical class; source document preserves alias spelling. No separate alias subclass is fabricated."));

   }
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
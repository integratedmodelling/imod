package org.integratedmodelling.klab.services.reasoner.internal;
import java.nio.file.*;import java.util.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.*;import org.integratedmodelling.klab.api.lang.kim.*;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;
import org.integratedmodelling.klab.services.reasoner.owl.ObservationalContainmentSupport;
import org.semanticweb.owlapi.model.*;import org.semanticweb.owlapi.reasoner.OWLReasoner;
public class HierarchyCheck {
 static OWLClass cls(org.integratedmodelling.klab.services.reasoner.owl.OWL o,Concept c)throws Exception{var m=o.getClass().getDeclaredMethod("getOWLClass",Concept.class);m.setAccessible(true);return (OWLClass)m.invoke(o,c);}
 public static void main(String[] a)throws Exception{
  M49FixtureAudit.install();var root=Path.of(a[0]);boolean candidate=a[2].equals("candidate");var result=new LinkedHashMap<String,Object>();var checks=new LinkedHashMap<String,Boolean>();
  result.put("baseline","a3c73da88737d60331ace462e7bfbeb4df079ac2");result.put("mode",a[2]);
  try{
   var catalog=CapturedAuthorityCatalog.capture(Path.of(a[1]));var world=M49CompositionSourceLoader.load(root.resolve("flat-source"),catalog.components());
   checks.put("all ontology and strategy documents adapted",world.getOntologies().size()==(candidate?27:26)&&world.getObservationStrategies().size()==2);
   result.put("sourceNotifications",world.getOntologies().stream().flatMap(x->x.getNotifications().stream()).toList());
   var factory=SemanticEnvironmentFactory.fromLocalCatalog(root.resolve("assets"),Files.createDirectories(root.resolve("empty-catalog")),Path.of(a[1]));var input=factory.capture(world);var built=factory.build(input,()->false);
   result.put("beanStatus",input.beanStatus());result.put("logicalStatus",built.logicalStatus());result.put("diagnostics",built.diagnostics());checks.put("bean VALID",input.beanStatus().toString().equals("VALID"));checks.put("logical VALID",built.logicalStatus().toString().equals("VALID"));
   if(built.state()==null)throw new AssertionError("No semantic state");
   try(var state=built.state()){
    var actor=state.actor();var owl=actor.owl();checks.put("OWL consistent",owl.isConsistent());var unsat=owl.getUnsatisfiableClasses().entities().filter(c->!c.isOWLNothing()).map(Object::toString).toList();result.put("unsatisfiable",unsat);checks.put("zero unsatisfiable named classes",unsat.isEmpty());
    var rootGroup=actor.resolveConcept("life:Assemblage");var organism=actor.resolveConcept("life:Individual");var population=actor.resolveConcept("ecology:Population");var community=actor.resolveConcept("ecology:Community");
    checks.put("existing Assemblage remains abstract Subject",rootGroup.is(SemanticType.SUBJECT)&&rootGroup.is(SemanticType.ABSTRACT)&&!rootGroup.is(SemanticType.AGENT));
    checks.put("existing organism and ecological Agents retained",organism.is(SemanticType.AGENT)&&population.is(SemanticType.AGENT)&&community.is(SemanticType.AGENT));
    if(candidate){
     var cell=actor.resolveConcept("life:CellularBody");var anatomical=actor.resolveConcept("life:AnatomicalAssemblage");var group=actor.resolveConcept("life:CellAssemblage");
     checks.put("cell concrete MaterialBody Subject",cell.is(SemanticType.SUBJECT)&&!cell.is(SemanticType.ABSTRACT)&&actor.is(cell,actor.resolveConcept("physical:MaterialBody")));
     checks.put("anatomical intermediate abstract Subject under Assemblage",anatomical.is(SemanticType.SUBJECT)&&anatomical.is(SemanticType.ABSTRACT)&&actor.is(anatomical,rootGroup));
     checks.put("cell grouping concrete under anatomical intermediate",group.is(SemanticType.SUBJECT)&&!group.is(SemanticType.ABSTRACT)&&actor.is(group,anatomical));
     checks.put("cell grouping inherits shared Assemblage",actor.is(group,rootGroup));checks.put("no reverse broad-to-narrow inference",!actor.is(rootGroup,anatomical)&&!actor.is(anatomical,group));
     checks.put("no new group retyped organism or collective Agent",!actor.is(group,organism)&&!actor.is(anatomical,organism)&&!actor.is(group,actor.resolveConcept("life:CollectiveAgent")));
     checks.put("no ecological Agent ancestry introduced",!actor.is(group,population)&&!actor.is(group,community)&&!actor.is(population,group)&&!actor.is(community,group));
     var f=owl.getClass().getDeclaredField("reasoner");f.setAccessible(true);var dl=(OWLReasoner)f.get(owl);var df=dl.getRootOntology().getOWLOntologyManager().getOWLDataFactory();
     checks.put("group and ecological Agent intersection unsatisfiable",!dl.isSatisfiable(df.getOWLObjectIntersectionOf(cls(owl,group),cls(owl,population))));
     for(var c:List.of(rootGroup,anatomical,group,cell)){
      checks.put(c.getUrn()+" has no native bearer",actor.inherent(c)==null);
      checks.put(c.getUrn()+" has no observational containment contract",ObservationalContainmentSupport.declarationsForContainer(owl,c).isEmpty());
      checks.put(c.getUrn()+" has no created observables",actor.created(c).isEmpty());
     }
     var manager=M49CompositionSourceLoader.lastManager;var t=Class.forName("org.integratedmodelling.klab.services.resources.storage.WorkspaceManager$KimParser");var ctor=t.getDeclaredConstructor();ctor.setAccessible(true);var mt=Class.forName("org.integratedmodelling.klab.services.resources.storage.WorkspaceManager");var pf=mt.getDeclaredField("namespaceParser");pf.setAccessible(true);pf.set(manager,ctor.newInstance());var parse=mt.getDeclaredMethod("readNamespace",String.class,long.class,String.class,String.class);parse.setAccessible(true);
     var cases=new LinkedHashMap<String,String>();cases.put("organism","model review.cellhierarchy.checks:OrganismMass in kg set to [1];");cases.put("structural","model review.cellhierarchy.checks:StructuralMass in kg set to [1];");cases.put("wrongbearer","model review.cellhierarchy.checks:OrganismMass of review.cellhierarchy.checks:TestCellBody in kg set to [1];");cases.put("bodyoforganism","model each review.cellhierarchy.checks:TestCellBody of review.cellhierarchy.checks:TestOrganism;");var reports=new LinkedHashMap<String,Object>();
     for(var e:cases.entrySet()){
      var name="examples.cellhierarchy."+e.getKey();var text="namespace "+name+" using review.cellhierarchy.checks, life version 1.0;\n"+e.getValue();var report=new LinkedHashMap<String,Object>();report.put("source",text);boolean positive=List.of("organism","structural").contains(e.getKey());
      try{var ns=(KimNamespace)parse.invoke(manager,text,1L,"imod",name);var notes=new DocumentSemanticValidator(actor).validate(ns);report.put("sourceNotifications",ns.getNotifications());report.put("semanticDiagnostics",notes);boolean error=ns.getNotifications().stream().anyMatch(n->n.getLevel().severity>=3)||notes.stream().anyMatch(n->n.getLevel().severity>=3);checks.put("model "+e.getKey()+" expected "+(positive?"admission":"rejection"),positive?!error:error);if(positive)checks.put("model "+e.getKey()+" single authored output",ns.getStatements().size()==1&&((KimModel)ns.getStatements().get(0)).getObservables().size()==1);}catch(Throwable ex){report.put("exception",ex.toString());checks.put("model "+e.getKey()+" expected rejection exception",!positive);}reports.put(e.getKey(),report);
     }
     result.put("modelDocuments",reports);
    }
   }
  }catch(Throwable ex){result.put("failure",ex.toString());ex.printStackTrace();}
  checks.put("zero network attempts",M49FixtureAudit.denied.isEmpty());result.put("checks",checks);result.put("networkAttempts",M49FixtureAudit.denied);Files.write(root.resolve("RESULTS.json"),JacksonConfiguration.newObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsBytes(result));System.out.println("SUMMARY "+checks);
  if(result.containsKey("failure")||checks.values().contains(false))System.exit(1);
 }
}

package org.integratedmodelling.klab.services.resources.lang;

import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.*;
import java.io.StringReader;
import java.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parser.IParser;
import org.integratedmodelling.languages.WorldviewStandaloneSetup;
import org.integratedmodelling.languages.OntologySyntaxImpl;
import org.integratedmodelling.languages.api.ParsedObject;
import org.integratedmodelling.languages.worldview.Ontology;
import org.integratedmodelling.klab.api.lang.kim.KimOntology;
import org.integratedmodelling.klab.api.knowledge.SemanticType;
import org.junit.jupiter.api.Test;

/** Real local-source adaptation, not service loading, semantic visitor or Reasoner validation. */
class WorldviewStrawmanAssessmentTest {
  private final Path repo=Path.of(System.getProperty("strawman.repo"));
  private final Path reports=Path.of(System.getProperty("strawman.reports"));
  private record Result(Map<String,KimOntology> adapted,List<String> errors) {}
  private Result assess(boolean overlay) throws Exception {
    var parser=new WorldviewStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(IParser.class);
    Map<String,Ontology> syntax=new TreeMap<>();
    Map<String,Path> paths=new TreeMap<>();
    try(var files=Files.walk(repo.resolve("src"))) {
      for(var p:files.filter(x->x.toString().endsWith(".kwv")).toList()) paths.put(p.getFileName().toString(),p);
    }
    if(overlay) try(var files=Files.walk(repo.resolve("experiments/strawman-2026/candidate/src"))) {
      for(var p:files.filter(x->x.toString().endsWith(".kwv")).toList()) paths.put(p.getFileName().toString(),p);
    }
    for(var p:paths.values()) {
      var result=parser.parse(new StringReader(Files.readString(p)));
      assertFalse(result.hasSyntaxErrors(),p.toString());
      var ast=(Ontology)result.getRootASTElement();
      assertNull(syntax.put(ast.getNamespace().getName(),ast),"duplicate namespace");
    }
    var scope=new WorldviewValidationScope();
    Map<String,KimOntology> adapted=new LinkedHashMap<>();
    List<String> errors=new ArrayList<>(), warnings=new ArrayList<>();
    Set<String> attempted=new HashSet<>();
    while(attempted.size()<syntax.size()) {
      boolean progress=false;
      for(var entry:syntax.entrySet()) {
        String ns=entry.getKey(); var ast=entry.getValue();
        if(attempted.contains(ns)||!attempted.containsAll(ast.getNamespace().getImported())) continue;
        progress=true;attempted.add(ns);
        try {
          var bean=new OntologySyntaxImpl(ast,scope) {
            @Override protected void logWarning(ParsedObject t,EObject o,EStructuralFeature f,String m) { warnings.add(ns+": "+m); }
            @Override protected void logError(ParsedObject t,EObject o,EStructuralFeature f,String m) { errors.add(ns+": "+m); }
          };
          var ontology=LanguageAdapter.INSTANCE.adaptOntology(bean,"imod",List.of(),0L);
          adapted.put(ns,ontology); scope.addNamespace(ontology);
          for(var notification:ontology.getNotifications()) {
            if(notification.getLevel().severity>=3) errors.add(ns+": "+notification.getMessage());
            else warnings.add(ns+": "+notification.getLevel()+" "+notification.getMessage());
          }
        } catch(Exception e) { errors.add(ns+": "+e.getClass().getSimpleName()+": "+e.getMessage()); }
      }
      assertTrue(progress,"Unresolved/cyclic imports");
    }
    Files.createDirectories(reports);
    String name=overlay?"overlay-adaptation.txt":"baseline-adaptation.txt";
    Files.writeString(reports.resolve(name),"Attempted="+attempted.size()+" adapted="+adapted.size()+" errors="+errors.size()+" warnings="+warnings.size()+"\nERRORS\n"+String.join("\n",errors)+"\nWARNINGS\n"+String.join("\n",warnings));
    return new Result(adapted,errors);
  }
  @Test void baselineWorldviewAdaptation() throws Exception {
    var result=assess(false);
    assertTrue(result.errors.isEmpty(),"Baseline adaptation errors; see baseline-adaptation.txt: "+result.errors);
    assertEquals(26,result.adapted.size());
  }
  @Test void overlayWorldviewAdaptationAndAlias() throws Exception {
    var result=assess(true);
    assertTrue(result.errors.isEmpty(),"Overlay adaptation errors; see overlay-adaptation.txt: "+result.errors);
    var canonical=result.adapted.get("hydrology").getStatements().getFirst();
    var alias=result.adapted.get("hydrology.terms").getStatements().getFirst();
    assertEquals("SurfaceCatchment",canonical.getUrn());
    assertTrue(canonical.getType().contains(SemanticType.SUBJECT));
    assertFalse(canonical.isAlias());
    assertTrue(alias.isAlias());
    assertTrue(alias.getType().contains(SemanticType.SUBJECT));
    assertEquals(27,result.adapted.size());
  }
}

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.util.Base64;
import org.eclipse.xtext.parser.IParser;
import org.integratedmodelling.languages.ObservableStandaloneSetup;

/** Actual Observable entry-rule parsing. No linking, semantic type validation or execution. */
public class ParseDossierQuestions {
  public static void main(String[] args) throws Exception {
    IParser parser = new ObservableStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(IParser.class);
    for (String line : Files.readAllLines(Path.of(args[0]))) {
      String[] fields=line.split("\\t",2);
      String expression=new String(Base64.getDecoder().decode(fields[1]),StandardCharsets.UTF_8);
      var result=parser.parse(new StringReader(expression+";"));
      int errors=0;
      StringBuilder messages=new StringBuilder();
      for(var error:result.getSyntaxErrors()) {
        errors++;
        messages.append(error.getSyntaxErrorMessage().getMessage().replace('\t',' ').replace('\n',' ')).append(" | ");
      }
      System.out.println(fields[0]+"\t"+(errors==0?"PASS":"FAIL")+"\t"+messages);
    }
  }
}

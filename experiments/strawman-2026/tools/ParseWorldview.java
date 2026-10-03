import java.nio.file.*;
import java.io.*;
import org.eclipse.xtext.parser.IParser;
import org.integratedmodelling.languages.WorldviewStandaloneSetup;

/**
 * Syntax only: deliberately does not claim linking, adaptation or reasoner
 * validation.
 */
public class ParseWorldview {
	public static void main(String[] args) throws Exception {
		IParser parser = new WorldviewStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(IParser.class);
		int files = 0, failures = 0;
		for (String arg : args) {
			Path root = Path.of(arg);
			try (var paths = Files.walk(root)) {
				for (Path p : paths.filter(x -> x.toString().endsWith(".kwv")).sorted().toList()) {
					files++;
					var result = parser.parse(new StringReader(Files.readString(p)));
					int errors = 0;
					for (var error : result.getSyntaxErrors()) {
						errors++;
						System.out.println(
								p + ":" + error.getStartLine() + ": " + error.getSyntaxErrorMessage().getMessage());
					}
					if (errors > 0)
						failures++;
					System.out.println("PARSE " + (errors == 0 ? "PASS " : "FAIL ") + p + " errors=" + errors);
				}
			}
		}
		System.out.println("SUMMARY files=" + files + " failed=" + failures + " syntax-only");
		if (failures > 0)
			System.exit(1);
	}
}

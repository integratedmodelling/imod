import java.io.File;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.integratedmodelling.klab.api.services.resources.workflow.ProposalReview.BootstrapDossier;
import org.integratedmodelling.klab.api.services.resources.workflow.BootstrapDossierValidator;

/** Read-only check against task-7's actual DTO/structural validator, not workflow or semantic execution. */
public class ValidateBackendDossier {
 public static void main(String[] args) throws Exception {
  var mapper=new ObjectMapper();
  var dossier=mapper.readValue(new File(args[0]),BootstrapDossier.class);
  var errors=BootstrapDossierValidator.errors(dossier);
  System.out.println(mapper.writeValueAsString(Map.of("errors",errors,"coverage",BootstrapDossierValidator.coverage(dossier),"scope","Actual backend DTO deserialization and structural reference checks only; no scientific acceptance, workflow transition or production validator")));
  if(!errors.isEmpty())System.exit(1);
 }
}

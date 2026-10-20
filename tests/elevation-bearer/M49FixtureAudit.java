package org.integratedmodelling.klab.services.reasoner.internal;
import java.security.Permission;
import java.util.*;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import static net.bytebuddy.matcher.ElementMatchers.*;
public class M49FixtureAudit {
 public static final List<String> denied=Collections.synchronizedList(new ArrayList<>());
 @SuppressWarnings("removal") public static void install() {
  System.setSecurityManager(new SecurityManager(){
   public void checkPermission(Permission p){}
   public void checkConnect(String host,int port){
    if((host.equals("127.0.0.1")||host.equals("::1")||host.equals("0:0:0:0:0:0:0:1"))&&StackWalker.getInstance().walk(s->s.anyMatch(f->f.getClassName().equals("sun.nio.ch.PipeImpl$Initializer$LoopbackConnector"))))return;
    denied.add(host+":"+port);throw new SecurityException("External networking denied: "+host+":"+port);
   }
  });
  new AgentBuilder.Default().with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
   .with(AgentBuilder.Listener.StreamWriting.toSystemError().withErrorsOnly())
   .type(named("org.integratedmodelling.klab.authority.un.UnAuthority"))
   .transform((builder,type,loader,module,domain)->builder.visit(Advice.to(Calls.class).on(named("configure").or(named("restoreConfiguration")).or(named("captureConfiguration")))))
   .type(named("org.integratedmodelling.klab.services.reasoner.ReasonerService"))
   .transform((builder,type,loader,module,domain)->builder.visit(Advice.to(Loads.class).on(named("loadKnowledge").and(takesArguments(2)))))
   .type(named("org.integratedmodelling.klab.authority.un.SparqlClient"))
   .transform((builder,type,loader,module,domain)->builder.visit(Advice.to(Transport.class).on(named("select"))))
   .installOn(ByteBuddyAgent.install());
 }
 public static class Transport {
  @Advice.OnMethodEnter(skipOn=Advice.OnNonDefaultValue.class)
  public static com.fasterxml.jackson.databind.JsonNode enter(@Advice.Argument(2)String query)throws Exception {
   if(!"producer".equals(System.getProperty("land.audit.phase")))throw new AssertionError("UN transport outside producer");
   synchronized(System.getProperties()){System.setProperty("m49.fixture.selects",Integer.toString(Integer.parseInt(System.getProperty("m49.fixture.selects","0"))+1));}
   return new com.fasterxml.jackson.databind.ObjectMapper().readTree(java.nio.file.Files.readAllBytes(java.nio.file.Path.of(System.getProperty(query.contains("?scheme")?"m49.fixture.catalogue":"m49.fixture.rows"))));
  }
  @Advice.OnMethodExit public static void exit(@Advice.Enter com.fasterxml.jackson.databind.JsonNode supplied,@Advice.Return(readOnly=false)com.fasterxml.jackson.databind.JsonNode result){result=supplied;}
 }
 public static class Loads {
  @Advice.OnMethodExit public static void exit(@Advice.Return Object result,@Advice.Argument(1)Object scope,@Advice.This Object actor){recordLoad(result,scope,actor);}
 }
 public static void recordLoad(Object result,Object scope,Object actor){
  try {
   var messages=new ArrayList<String>();
   for(Object source:List.of(result,scope)) {
    var notifications=(Collection<?>)source.getClass().getMethod("getNotifications").invoke(source);
    for(Object note:notifications)messages.add(note.getClass().getMethod("getLevel").invoke(note)+": "+note.getClass().getMethod("getMessage").invoke(note));
   }
   System.setProperty("land.audit.lastLoadDiagnostics",messages.toString());
   System.setProperty("land.audit.lastSuccessfulBindings",actor.getClass().getMethod("successfulAuthorityConfigurations").invoke(actor).toString());
  }catch(Throwable error){System.setProperty("land.audit.loadDiagnosticReadError",error.toString());}
 }
 public static class Calls {
  @Advice.OnMethodEnter public static void enter(@Advice.Origin("#m")String method){
   var properties=System.getProperties();String phase=properties.getProperty("land.audit.phase","setup");
   synchronized(properties){String key="land.audit."+method+"."+phase;properties.setProperty(key,Integer.toString(Integer.parseInt(properties.getProperty(key,"0"))+1));}
   if(method.equals("configure")&&!phase.equals("producer"))throw new AssertionError("Live LAND configure during "+phase);
  }
 }
 public static Map<String,String> counters(){var result=new TreeMap<String,String>();System.getProperties().forEach((k,v)->{if(k.toString().startsWith("land.audit."))result.put(k.toString(),v.toString());});return result;}
}

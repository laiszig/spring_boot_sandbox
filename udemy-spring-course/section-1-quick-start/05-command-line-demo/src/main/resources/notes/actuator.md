Spring boot actuator
- automatically exposes endpoints for metrocs out-of-the-box
- endpoints are prefixed with /actuator

/health 
- checks the status of the application
- normally used by monitoring apps to see if your app is running.
- customizable

/info
- by default, only /health is exposed
- /info can provide info about application
- to expose this endpoint (add to applications.properties)
  - management.endpoints.web.exposure.include= health,info
  - management.info.env.enabled=true
- default is empty
- need to add info to the application.properties
- properties starting with "info" will be used by /info

+10 actuator endpoints
/auditevents
/beans
- list of all beans registered in the Spring application context
- includes spring boot internal beans, and custom beans
- usefull for debugging configuration
- the /beans endpoint provides valuable insights into the beans managed by the
Spring application context, helping developers debug and troubleshoot issues 
related to bean instantiation, dependency injection, configuration, and lifecycle management.
/mappings
- list of all @RequestMappings
www.luv2code.com/actuator-endpoints
/threaddump
- List of all threads in your application
- Useful for analyzing and profiling your application's performance

Use wildcard "*" to expose all endpoints
Can also expose individual endpoints with a coma-delimited list
management.endpoints.web.exposure.include=*

What about security?
- Add Spring security to project and endpoints are secure
- you can customize spring security for spring boot actuator
- use database for roles, encrypted passwords, etc
  www.luv2code.com/actuator-docs
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
/mappings
- list of all @RequestMappings
www.luv2code.com/actuator-endpoints

Use wildcard "*" to expose all endpoints
Can also expose individual endpoints with a coma-delimited list
management.endpoints.web.exposure.include=*
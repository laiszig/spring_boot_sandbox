Spring boot has over 1000 properties
They are roughly grouped into the following categories
- Core 
  - Log levels severity mapping
  logging.level.org.springframework=DEBUG
  logging.level.org.hibernate=TRACE
  logging.level.com.luv2code=INFO
  - Log file name
  logging.file.name=my-crazy-stuff.log
  logging.file.path=c:/myapps/demo
  www.luv2code.com/spring-boot-logging

- Web
  - HTTP server port
  server.port=7070
  - Context path of the application
  server.servlet.context-path=/my-silly-app
  - Default HTTP session time out
  server.servlet.session.timeout=15m
  - Endpoints to include by name or wildcard
  management.endpoints.web.exposure.include=*
  - Endpoints to exclude by name or wildcard
  management.endpoints.web.exposure.exclude=beans, mapping
  - Base path for actuator endpoints
  management.endpoints.web.base-path=/actuator
- Security
- Data
- Actuator
- Integration
- DevTools
- Testing
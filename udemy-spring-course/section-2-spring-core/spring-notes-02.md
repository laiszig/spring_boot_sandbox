# 📚 Spring Boot 3, Spring 6 & Hibernate for Beginners

## 🎓 Spring Core

### 📝 Inversion of Controle (IoC)
    - The approach of outsourcing the construction and management of objects.

### 📝 Spring Container
- **Primary functions:** 
    - Create and manage objects (Inversion of Control)
    - Inject object dependencies (Dependency Injection)

- **Configuring Spring Container:** 
    - XML configuration file (legacy)
    - Java Annotations (modern)
    - Java Source Code (modern)

### 📝 Dependency Injection
    - The dependency inversion principle.
    - The client delegates to another object the responsibility of providing its dependencies.
    - The ideia is: give me a given objects, if it has any components or helper components, then assemble it ahead of time and give it to me ready.

- **Demo Example** 
    - Coach will provide daily workouts
    - The DemoController wants to use a Coach object.
    - New helper: Coach - this is a dependency
    - We need to inject this dependency into the controller

- **Injection Types** 
    - There are multiple types of injection with Spring
    - Constructor injection, setter injection
- **Which one to use?** 
    - Constructor Injection
    - Use this when you have required dependencies
    - Generally recommended by the spring.io development team as first choice
    - Setter Injection
    - Use this when you have optional dependencies
    - If dependency is not provided, your app can provide reasonable 
    default logic

### 📝 Spring AutoWiring
    - For dependency injection, Spring can use autowiring
    - Spring will look for a class that matches
    - matches by type: class or interface
    - Spring will inject it automatically ... hence it is autowired
- **Autowiring Example** 
    - Injecting a Coach implementation
    - Spring will scan for @Components
    - Any one implements the Coach interface? 
    - If so, let's inject them. For example: CricketCoach

### 📝 Development Process - Constructor Injection
    1. Define the dependency interface and class
    2. Create Demo REST Controller
    3. Create a constructor in your class for injections.
    4. Add @GetMapping for /dailyworkout

- **@Component annotation**
    - @Component marks the class as a Spring Bean
    - A Spring Bean is just a regular Java class that is managed by Spring
    - @Component also makes the bean available for dependency injection

- **How Spring Processes the application**
    - The Spring Framework will perform operations behind the scenes for us.
    - Behind the scenes, Spring is going to create a new instance of Coach and perform constructor injection on the controller:
        Coach theCoach = newCricketCoach();
        DemoController demoController = new DemoController(theCoach);
    - But spring is more than just IoC and Dependency Injection
    - For small basic apps, it may be hard to see the benefits of Spring
    - Spring is targeted for enterprise, real-time, real-time / real-world applications
    - Spring provides features such as:
        - DB access and Transactions
        - REST APIs and Web MVC
        - Security
        - etc...

- **Scanning for Component Classes**
    - Spring will scan your java classes for special annotations
    - @Component, etc
    - Automatically register the beans in the Spring container

- **Annotations**
    - @SpringBootApplication is composed of the following annotations
    - @EnableAutoConfiguration: Enables Spring Boot's auto-configuration support
    - @ComponentScan: Enables component scanning of current package. Also recursively scans sub-packages
    - @Configuration: Able to register extra beans with @Bean or import other configuration classes
    - Behind the scenes, this annotation creates application context and register all beans.
        - Starts the embedded server Tomcat, etc.
        - SpringApplication.run(MyApplicationName, args); -> Bootstrap your Spring Boot Application

- **More on Component Scanning**
    - By default, Spring Boot starts component scanning
        - From same package as your mains Spring Boot application
        - Also scans sub-packages recursively
    - This implicitly defines a base search package
        - Allows you to leverage default component scanning
        - No need to explicitylu reference the base package name

    - If it's outside the core package, Spring Boot won't scan it.
        - If you want it to scan it, you can explicitly list the base packages to scan.
        - Example:
        @SpringBootApplication( scanBasePackages={"com.laiszig.springcoredemo", 
										  "com.laiszig.util", 
										  "com.org.acme.cart", 
										  "edu.cmu.srs"})
        public class SpringBootCoreDemoApplication {
	    ...
        }

### 📝 Setter Injection
    - Inject dependencies by calling setter methods on your class
        1. Create setter methods in your class for injections
        2. Configure the dependency injection with @Autowired Annotation

- **Injection Types - Which one to use?**
    -  Constructor injection
	    - use when you have required dependencies
	    - generally recommended by the spring.io development team as first choice
    - Setter injection
	    - use this when you have optional dependencies
	    - if dependency is not provided, your app can provide reasonable default logic

### 📝 Initialization
    - By default, all beans are initialized
    - Spring will create an instance of each and make them available

- **Lazy Initialization**
    - Instead of creating all beans up front, we can specify lazy initialization
    - A bean will only be initialized in the following cases:
    - It is needed for dependency injection.
    - Or it is explicitly requested
    - Add the @Lazy annotation to a given class

- **Global configuration**
    - application.properties
    spring.main.lazy-initialization=true
	    - all beans are lazy no beans are created until needed. Including our DemoController.
	    - Once we access REST endpoint/dailyworkout, spring will determine dependencies for DemoController
	    - For dependency resolution, spring creates instance of CricketCoach first, then creates an instance of DemoController,
	and then injects the CricketCoach.
    - Advantages:
        - Only create objects as needed
        - May help with faster startup time if you have a large number of components
    - Disadvantages
        - If you have web related components like @RestController, not created until requested
        - May not discover configuration issues until too late
        - Need to make sure you have enough memory for all beans once created

### 📝 Bean Scopes
    - Scope refers to the lifecycle of a bean
    - How long does the bean live?
    - How many instances are created?
    - How is the been shred?
    - Default scope is singleton. 
        - Spring container creates only one instance of the bean, by default
        - It is cached in memory
        - All dependency injections for the bean 
            - will reference the SAME bean
    - Aditional spring bean scopes
        - Singleton: Create a single shared instance of the bean. Default scope.
        - Prototype: Creates a new bean instance for each container requested
    In contrast to other scopes, Spring does not manage the complete lyfecycle of a prototype bean. Configured destruction lifecycle callbacks are not called.
    The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.
        - Request: Scoped to an HTTP web request. Only used for web apps.
        - Session: Scoped for an HTTP web session. Only Used for web apps.
        - Global-session

### 📝 Bean Scopes
Container Started > Bean Instantiated > Dependencies Injected > Internal Spring Processing > Your Custom Init Method (Bean ready for use)

- **Bean Lifecycle Methods/Hooks**
    - You can add custom code during bean initialization
        - Calling custom business logic methods
        - Setting up handles to resources(db, sockets, file, etc)
    - You can add custom code during bean destruction
        - Calling custom business logic methods
        - Clean up handles to resources(db, sockets, files, etc)
    @PreDestroy
    @PostDestroy


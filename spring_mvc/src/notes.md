Spring MVC
Model - View - Controller

Principles:

- Clear separation of roles
- Adaptability, non-intrusiveness, and flexibility
- Reusable business code to eliminate duplication
- Customizable binding and validation
- Customizable handler mapping and view resolution
- Flexible model transfer

------

Annotations:

@Controller (All we need to implement a controller)
Stereotype annotation. It serves as a specialization of @Component,
allowing for implementation classes to be autodetected through classpath scanning.

@RequestMapping
Typically the class-level annotation maps a specific request path onto a controller.
With additional method-level annotations, the mapping for a specific HTTP request methods
(GET, POST) or an HTTP request parameter condition.


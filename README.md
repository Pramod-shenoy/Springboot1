# Day 1 of Springboot
## Dependency Injection and Autowiring in Springboot
Dependency Injection (DI) and Autowiring are core concepts in Spring Framework for managing object dependencies. Here’s a brief overview:

# Dependency Injection (DI)
DI is a design pattern where an object’s dependencies are injected by an external entity rather than created internally. This approach decouples object creation from business logic, making applications more modular, testable, and flexible. In Spring, DI can be achieved through:

Constructor Injection - Dependencies are injected via the constructor.
Setter Injection - Dependencies are injected using setter methods.
Field Injection (not recommended for all cases due to issues in testing and readability).

 # Autowiring
Autowiring is a feature in Spring that automatically injects dependencies based on certain criteria, removing the need to manually define every dependency. Spring scans the application context and tries to match and inject beans. Autowiring can be configured using annotations like @Autowired (most common) or by specifying an autowiring mode in the configuration. Main autowiring modes include:

byType - Matches a bean based on type.
byName - Matches a bean based on the name.
@Autowired (annotation) - Injects by type and, if ambiguity arises, can be refined with @Qualifier.
Together, DI and Autowiring streamline bean management in Spring, allowing cleaner, loosely-coupled, and more maintainable code.


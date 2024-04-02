What is Hibernate?
- A Framework for persisting/saving Java objects in a database.
- Hibernate handles all of the low-level SQL
- Minimizes the amount of JDBC code you have to develop
- Hibernate provides the Object-to-Relatinal Mapping (ORM)

Object-To-Relational Mapping(ORM)
- The developer defines mapping between Java class and database table

JPA
- Jakarta Persistence API
- Standard API for ORM
- Only a specification
	- Defines a set of interfaces
	- Requires an implementation to be usable

Benefits of JPA
- By having a standard API, you are not locked to vendor's implementation
- Maintain portable, flexible code by coding to JPA spec.
- Can theoretically switch vendor implementations

Hibernate/JPA/JDBC relationship
Hibernate, JPA (Java Persistence API), and JDBC (Java Database Connectivity) are all related to database access
in Java applications, but they serve different purposes and operate at different levels of abstraction.
 JDBC is a low-level API for database access, Hibernate is a high-level ORM framework that abstracts away the database details, 
 and JPA is a standard API for object-relational mapping that Hibernate implements, along with other ORM frameworks.
- Hibernate/JPA uses JDBC for all database communications.
- It is another layer of abstraction on top of JDBC.

Automatic Data Source Configuration
- Based on configs, Spring Boot will automatically create the beans:
	- DataSource, EntityManager,...
- You can then inject these into your app, for example your DAO.

Jpa dev process
1. Annotate Java Class
	- Map class to database table
	- Map fields to database columns
2. Develop Java Code to perform database operations

Terminology

- Entity Class: Java class that is mapped to a database table
	- At a minimum, the Entity class must:
		- Be annotated with @Entity
		- Have a public or protected no-argument constructor
		- The class can have other constructors
Constructors in Java - Refresher
- If you don't declare any constructors, Java will prove a no-argument constructor by default
- If you declare constructors with arguments then you do not get a no-argument constructor
	- In this case, you have to explicitly declare a no-argument constructor
	
@Column - Optional
- If not specified, the column is the same name as the Java fields
- In general, not recommended.
	- If you refactor the Java code, then it will not match existing database columns
	- This is a breaking change and you will need to update database column
- Same applies to @Table, database table name is the same as the class

Primary Key
- Uniquely identifies each row in a table
- Must be a unique value
- Cannot contain NULL values

ID Generation Strategies
- GenerationType.AUTO - Pick an appropriate strategy for the particular database
- GenerationType.IDENTITY - Assign primary keys using database identity column
- GenerationType.SEQUENCE - Assign primary keys using a database sequence
- GenerationType.TABLE - Assign primary keys using an underlying database table to ensure uniqueness

You can define a custom generation strategyorg.hibernate.id.IdentifierGenerator
Override the method: public Serializable generate(...)
## Demonstrates the Hibernate GenericGenerator "Foreign" strategy and one-to-one mapping with custom generator.
 
## TechStack.
  1. Spring Core/ORM.
  2. Hibernate Framework.
  3. Lombok api.
  4. Gradle build and dependency management.
  
## Problem Statement.
  1. Establish the One-to-One mapping between two tables.
  2. Child table must use the Parent table id as Foreign key and as well Primary key. 
     (This way we can avoid extra primary key column creation, reduce the overhead to db)
  3. As soon as Parent record inserted the child record should get inserted.
  
## Pre-requisites.
  1. Java 7 or above.
  2. Gradle 2.3 or above.
  
## How to import?
  Eclipse IDE.
     1. Clone/download as zip.
     2. run ``> gradle eclipse ``  This will create eclipse ide related files, now you can import as eclipse project.
  
## How to Run?
  Added Test class called DrugTest.java, Run as Junit test.
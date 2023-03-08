### CRUD EXERCISE WITH SQL
Access the page -> https://start.spring.io/, and generate a spring boot project with the following features:
must have an entity called "Fruit", which has the following properties:

- int id
- String name
- Int qkilos

Taking advantage of the JPA specification, you will have to persist in a SQL database, following the MVC pattern. To do this, depending on the main package, you will create a package structure, where you will place the classes you need:

- controller
- model.service
- model.repository
- model.domain

The class located in the CONTROLLER PACKAGE, must be able to respond to the following requests to update and consult information:

* http: // localhost: 8080/fruit/add
* http: // localhost: 8080/fruit/update
* http: // localhost: 8080/fruit/delete/{id}
* http: // localhost: 8080/fruit/getone/{id}
* http: // localhost: 8080/fruit/getal

Important

You will need to take into account the good design practices of the APIs, using the error codes and the answers in case of incorrect invocations. (You can consult information about Responsitity).
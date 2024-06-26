# Spring Playground
A repository for me to experiment with Spring/Spring Boot concepts

1. rest_service - Create a RESTful Web Service

2. consume - An application that consumes a RESTful web service. It consumes from quoters-masters

3. swagger -Implementation of Swagger using Open API. Swagger is a powerful framework for designing, building, documenting, and consuming RESTful APIs. OpenAPI, formerly known as the Swagger Specification, is a widely adopted standard for describing RESTful APIs. 

4. unittest - Learning on JUnit 5, a unit testing framework for Java. 

5. mockito - Learning on Mockito, implemented together with JUnit. Mockito is a mocking framework, which allows for creation of mocked objects. 

6. Spring-security - Implementation of a basic authentication page using Spring-security 

7. Jacoco - Implementation of Java code coverage. Use 'mvn test' to generate report.

8. JPA - Implementation fo Java Persistence API (JPA) on a Customer entity. Data is stored in H2 database. 

9. Task scheduling - Implement scheduling of task at fixed intervals. 

10. Caching - Implementation of caching a Spring managed bean, in this case on a simple book repository

11. Feign Client - Implementation of feign client. Good learning

12. Tanzu - Observability with VMWare's Tanzu

13. GraphQL - Built a GraphQL service, running the query and writing a GraphQL test

14. Exception handling - Handling exception at the controller level with annotations @ControllerAdvice and @ExceptionHandler

15. Redis messaging broker - uses a publish-subscribe (pub/sub) messaging paradigm, where messages are published to a channel and any subscribers to that channel will receive the messages.

16. RabbitMQ - A RabbitMQ AMQP server that publishes and subscribes to messages and creating a Spring Boot application to interact with that RabbitMQ server. The setting up of a RabbitMQ AMQP server is done separately.  
```
docker pull rabbitmq
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.13-management
```





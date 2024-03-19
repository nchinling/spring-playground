# Swagger and OpenAPI

Swagger is a set of tools for designing, building, documenting, and consuming RESTful APIs. It provides a framework for describing API endpoints, request/response formats, authentication methods, and more. 

OpenAPI, formerly known as Swagger Specification, is a specification for describing RESTful APIs. It provides a standard way to define API endpoints, request/response schemas, parameters, authentication methods, and other details. OpenAPI documents are written in YAML or JSON format and serve as a contract between API providers and consumers.

## Getting Started with Swagger and OpenAPI

### Step 1: Add Dependencies

Add the following dependency to your `pom.xml` or `build.gradle` file to integrate Swagger with your Spring Boot application:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.2.0</version>
</dependency>
```


## Step 2: Configure Swagger

Spring Boot automatically configures Swagger based on the dependencies added. You can customize Swagger behavior using configuration properties or annotations in your Spring Boot application.

## Step 3: Access API Documentation

Once your Spring Boot application is running, you can access the API documentation in the following ways:

- **JSON Format**: Visit [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs) to view the OpenAPI specification in JSON format.
  
- **YAML Format**: Access [http://localhost:8080/v3/api-docs.yaml](http://localhost:8080/v3/api-docs.yaml) to view the OpenAPI specification in YAML format.
  
- **Swagger UI**: Navigate to [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) to interact with the API documentation using Swagger UI. Swagger UI provides a user-friendly interface for exploring API endpoints, making requests, and viewing responses.

## Step 4: Explore and Test APIs

Use Swagger UI to explore the available API endpoints, understand request/response formats, and test API functionality directly from the browser.


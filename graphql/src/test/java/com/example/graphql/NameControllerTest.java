package com.example.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(NameController.class)
public class NameControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldGetFirstName() {
        this.graphQlTester
				.documentName("nameDetails")
				.variable("name", "Chin Ling")
                .execute()
                .path("personByName")
                .matchesJson("""
                    {
                        "id": "1",
                        "name": "Chin Ling",
                        "sex": "male",
                        "age": 21
                    }
                """);
    }
}

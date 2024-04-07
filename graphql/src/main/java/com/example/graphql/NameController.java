package com.example.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class NameController {

    @QueryMapping
    public Name personByName(@Argument String name) {
        return Name.getByName(name);
    }


}

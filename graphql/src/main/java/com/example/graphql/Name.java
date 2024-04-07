package com.example.graphql;

import java.util.Arrays;
import java.util.List;

public record Name (String id, String name, String sex, int age) {

    private static List<Name> names= Arrays.asList(
            new Name("1", "Chin Ling", "male", 21),
            new Name("2", "Shan Shan", "female", 20),
            new Name("3", "Billabong", "male", 23)
    );

    public static Name getByName(String name ) {
        return names.stream()
				.filter(ename -> ename.name().equals(name))
				.findFirst()
				.orElse(null);
    }
}

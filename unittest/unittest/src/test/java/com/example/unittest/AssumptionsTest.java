package com.example.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void trueAssumption(){
        assumeTrue(5>2);
        assertEquals(5+2,7);
    }

    @Test
    void falseAssumption(){
        assumeFalse(5 < 1);
        assertEquals(3+4, 7);
    }

    @Test
    void assumptionThat() {
        String someString = "Just a string";
        assumingThat(
            someString.equals("Just a string"),
            () -> assertEquals(2 + 2, 4)
        );
    }
    
}

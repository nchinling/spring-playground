package com.example.unittest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenNumberTest {

    IsNumberEven bean;

    @BeforeEach
    void setUp() {
        bean = new IsNumberEven();
    }

    // happy flow
    @Test
    void givenEvenNumber_whenCheckingIsNumberEven_thenTrue() {
        boolean result = bean.checkIsNumberEven(8);
        assertTrue (result);
    }

    // negative test
    @Test
    void givenOddNumber_whenCheckingIsNumberEven_thenFalse() {
        boolean result = bean.checkIsNumberEven(7);
        assertFalse(result);
    }

    
}

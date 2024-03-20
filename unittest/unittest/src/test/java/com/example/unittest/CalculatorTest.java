package com.example.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach                                         
    void setUp() {
        calculator = new Calculator();
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5),     
                "Regular multiplication should work");  
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }

    @Test
    @DisplayName("Simple addition should work")
    void testPositiveAddition() {
        assertEquals(225, calculator.add(99,126),"Positive addition should work");
    }

    @Test
    @DisplayName("Positive added to negative should work")
    void testNegativeAddition(){
        assertEquals(-5, calculator.add(-13, 8), "Addition with positive and negative numbers should work");
    }

    @Test
    @DisplayName("Negative added to negative should work")
    void testBothNegativeAddition(){
        assertEquals(-10, calculator.add(-7,-3), "Addition with both negative numbers should work");
    }
}

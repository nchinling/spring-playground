package com.example.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.unittest.Exception.InvalidAgeException;

public class ExceptionTest {

    User user;
    @Test
    void exceptionTesting() {
        user = new User();
        Throwable exception = assertThrows(InvalidAgeException.class, () -> user.setAge(-39));
        assertEquals("Age must be a non-negative integer.", exception.getMessage());
    }

    @Test
    void belowAgeexceptionTesting() {
        user = new User();
        Throwable exception = assertThrows(InvalidAgeException.class, () -> user.setAge(16));
        assertEquals("You are not qualified to drive yet.", exception.getMessage());
    }

    @Test
    void assertThrowsException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
        Integer.valueOf(str);
        });
    }
}

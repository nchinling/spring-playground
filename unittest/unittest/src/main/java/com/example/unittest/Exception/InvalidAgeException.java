package com.example.unittest.Exception;

public class InvalidAgeException extends IllegalArgumentException {
    public InvalidAgeException(String message){
        super(message);
    }
}

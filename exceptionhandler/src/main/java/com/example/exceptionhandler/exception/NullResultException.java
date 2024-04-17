package com.example.exceptionhandler.exception;

public class NullResultException extends Exception {
    public NullResultException() {
        super("Null object returned");
    }

    public NullResultException(String message) {
        super(message);
    }
}

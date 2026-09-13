package com.job_tracker.Exceptions;

public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(String message, String email) {
        super(message.replace("{}",email));
    }
}

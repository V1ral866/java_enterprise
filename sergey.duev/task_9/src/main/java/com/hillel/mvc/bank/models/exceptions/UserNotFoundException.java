package com.hillel.mvc.bank.models.exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(long userId) {
        super(String.format("User %s not found", userId));
    }

    public UserNotFoundException(long userId, Throwable cause) {
        super(String.format("User %s not found", userId), cause);
    }
}

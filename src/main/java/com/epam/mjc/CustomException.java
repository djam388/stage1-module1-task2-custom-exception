package com.epam.mjc;

public class CustomException extends IllegalArgumentException {

    public CustomException(Throwable error) {
        super(error);
    }

    public CustomException(String message, Throwable error) {
        super(message, error);
    }


}

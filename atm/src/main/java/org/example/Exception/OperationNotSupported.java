package org.example.Exception;

public class OperationNotSupported extends RuntimeException {
    public OperationNotSupported(String errorMessage) {
        super(errorMessage);
    }
}

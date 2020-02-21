package com.enigma.bootcamp.exception;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException() {
        super("invalid number of parking slots");
    }
    public InvalidNumberException (Integer numberOfCarSlots) {
        super(String.format("%s is invalid number of parking slots", numberOfCarSlots));
    }
}

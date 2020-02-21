package com.enigma.bootcamp.exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("Car is not found");
    }
}

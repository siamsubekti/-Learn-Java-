package com.enigma.bootcamp.exception;

public class ParkingSlotFullException extends RuntimeException{
    public ParkingSlotFullException() {
        super("Sorry, parking lot is full");
    }
}

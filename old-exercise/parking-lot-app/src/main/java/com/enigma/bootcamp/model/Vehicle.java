package com.enigma.bootcamp.model;

/* we made an abstract class to be accessed
by parking other than the car if at any time needed */
public abstract class Vehicle {
    //We make protected access modifiers to be accessed in the same package
    protected String registerNumber;

    public Vehicle (String registerNumber) {
        this.registerNumber =registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
}

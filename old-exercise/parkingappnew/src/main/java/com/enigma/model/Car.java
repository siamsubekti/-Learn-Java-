package com.enigma.model;

import java.util.Objects;

public class Car {
    private String lincenseNumber;
    private String colour;

    public Car(String lincenseNumber) {
        this.lincenseNumber = lincenseNumber;
    }
    public Car() {
    }

    public String getLincenseNumber() {
        return lincenseNumber;
    }

    public void setLincenseNumber(String lincenseNumber) {
        this.lincenseNumber = lincenseNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return lincenseNumber.equals(car.lincenseNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lincenseNumber);
    }
}

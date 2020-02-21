package com.enigma.bootcamp.model;

public class ParkingSlot {
    //We make access modifier private to maintain security when accessing other classes or methods
    private Vehicle vehicle;
    private Integer slot;

    //this constructor class
    public ParkingSlot (Vehicle vehicle, Integer slot) {
        this.vehicle = vehicle;
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return String.format("%s %s", slot+1, vehicle.getRegisterNumber());
    }
}

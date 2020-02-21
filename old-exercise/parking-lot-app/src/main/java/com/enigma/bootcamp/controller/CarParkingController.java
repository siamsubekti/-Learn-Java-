package com.enigma.bootcamp.controller;

import com.enigma.bootcamp.exception.CarNotFoundException;
import com.enigma.bootcamp.exception.ParkingSlotFullException;
import com.enigma.bootcamp.model.ParkingSlot;
import com.enigma.bootcamp.model.Vehicle;
import com.enigma.bootcamp.service.CarParkingService;

public class CarParkingController {
    CarParkingService carParkingService;

    public CarParkingController (Integer numberOfSlot) {
        carParkingService = new CarParkingService(numberOfSlot);
        System.out.println(String.format("Created parking lot with %s slots", numberOfSlot));
    }

    public String park(Vehicle vehicle) {
        try {
            ParkingSlot parkingSlot = carParkingService.park(vehicle);
            return String.format("Allocated slot number: %s", parkingSlot.getSlot()+1);
        }catch (ParkingSlotFullException exception) {
            return exception.getMessage();
        }
    }

    public String leave(Vehicle vehicle, Integer hour){
        try {
            ParkingSlot parkingSlot = carParkingService.leave(vehicle);
            Double price = carParkingService.calculatedPrice(hour);
            return String.format("Registration number %s with Slot Number %s is free with Charge %s", vehicle.getRegisterNumber(), parkingSlot.getSlot()+1, String.valueOf(price));

        }catch (CarNotFoundException exception){
            return String.format("Registration number %s not found", vehicle.getRegisterNumber());
        }
    }
    public String getStatus(){
        return carParkingService.ParkingSlotStatus();
    }
}

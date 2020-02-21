package com.enigma.bootcamp.service;

import com.enigma.bootcamp.exception.InvalidNumberException;

public class CarParkingService extends ParkingService {

    public CarParkingService(Integer numberOfCarSlots) throws InvalidNumberException {
        super(numberOfCarSlots);
    }
    @Override
    public Double calculatedPrice(Integer hour) {
        Double twoHoursPrice = new Double(10);
        if (hour <=2 ) {
            return twoHoursPrice;
        } else{
            return twoHoursPrice +((hour-2)*10);
        }
    }
}

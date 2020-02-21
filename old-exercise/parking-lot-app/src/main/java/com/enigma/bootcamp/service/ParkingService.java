package com.enigma.bootcamp.service;

import com.enigma.bootcamp.exception.CarNotFoundException;
import com.enigma.bootcamp.exception.InvalidNumberException;
import com.enigma.bootcamp.exception.ParkingSlotFullException;
import com.enigma.bootcamp.model.ParkingSlot;
import com.enigma.bootcamp.model.Vehicle;

//abstract class service if at any time parking is required in addition to parking for cars
public abstract class ParkingService {
    protected ParkingSlot[] parkingSlots;
    protected Integer numOfAvailableSlots;

    public ParkingService(Integer numberOfCarSlots) throws InvalidNumberException {
        if (numberOfCarSlots == null || numberOfCarSlots < 1) {
        throw new InvalidNumberException(numberOfCarSlots);
    }
        parkingSlots = new ParkingSlot[numberOfCarSlots];
        numOfAvailableSlots = numberOfCarSlots;
    }

    public ParkingSlot park(Vehicle vehicle){
        if(numOfAvailableSlots < 1){
            throw new ParkingSlotFullException();
        }

        for (int i = 0; i < parkingSlots.length; i++) {
            if(parkingSlots[i]==null){
                parkingSlots[i] = new ParkingSlot(vehicle, i);
                numOfAvailableSlots--;
                return parkingSlots[i];
            }
        }

        throw new ParkingSlotFullException();
    }

    public ParkingSlot leave(Vehicle vehicle) {
        for (int i = 0; i < parkingSlots.length; i++) {
            if(parkingSlots[i]!=null && parkingSlots[i].getVehicle()!=null && vehicle.equals(parkingSlots[i].getVehicle())){
                ParkingSlot exitingSlot = parkingSlots[i];
                parkingSlots[i] = null;
                numOfAvailableSlots++;
                return exitingSlot;
            }
        }
        throw new CarNotFoundException();
    }

    public String ParkingSlotStatus (){
        StringBuilder sb = new StringBuilder();
        sb.append("Slot No. Regristration No. \n");

        for (ParkingSlot parkingSlot: parkingSlots) {
            if (parkingSlot != null) {
                sb.append(parkingSlot);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public abstract Double calculatedPrice(Integer hour);

    public Integer getNumOfAvailableSlots() {
        return numOfAvailableSlots;
    }
}



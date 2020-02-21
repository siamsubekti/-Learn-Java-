package com.enigma.bootcamp;

import com.enigma.bootcamp.controller.CarParkingController;
import com.enigma.bootcamp.model.Car;

public class MainApp {
    public static void main(String[] args) {

        CarParkingController parkLot = new CarParkingController(6);
        System.out.println(parkLot.park(new Car("KA-01-HH-1234")));
        System.out.println(parkLot.park(new Car("KA-01-HH-9999")));
        System.out.println(parkLot.park(new Car("KA-01-BB-0001")));
        System.out.println(parkLot.park(new Car("KA-01-HH-7777")));
        System.out.println(parkLot.park(new Car("KA-01-HH-2701")));
        System.out.println(parkLot.park(new Car("KA-01-HH-3141")));
        System.out.println(parkLot.leave(new Car("KA-01-HH-3141"), 4));
        System.out.println(parkLot.getStatus());
        System.out.println(parkLot.park(new Car("KA-01-P-333")));
        System.out.println(parkLot.park(new Car("DL-12-AA-9999")));
        System.out.println(parkLot.leave(new Car("KA-01-HH-1234"), 4));
        System.out.println(parkLot.leave(new Car("KA-01-BB-0001"), 6));
        System.out.println(parkLot.leave(new Car("DL-12-AA-9999"), 2));
        System.out.println(parkLot.park(new Car("KA-09-HH-0987")));
        System.out.println(parkLot.park(new Car("CA-09-IO-1111")));
        System.out.println(parkLot.park(new Car("KA-09-HH-0123")));

        System.out.println(parkLot.getStatus());
    }
}

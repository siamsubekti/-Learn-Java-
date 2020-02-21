package com.enigma.bootcamp.model;

/* we only need to inherit by extending abstract classes to be able to use the properties
of the abstract vehicle class */
public class Car extends Vehicle{

    public Car(String registerNumber) {
        super(registerNumber);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return  false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Car car = (Car)obj;

        return this.getRegisterNumber().equals(car.getRegisterNumber());
    }
}

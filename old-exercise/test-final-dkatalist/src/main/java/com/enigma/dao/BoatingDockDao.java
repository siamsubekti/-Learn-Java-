package com.enigma.dao;

import com.enigma.model.Boat;

public interface BoatingDockDao {
    public String createParkingBoat();

    public String dock(Boat boat);

    public String leave(Boat slots);

    public String status();

    public String search(String boat);
}

package com.enigma.repair.dao;

import com.enigma.repair.model.Mechanic;

public interface MechanicDao {

    Mechanic hireMechanic(Mechanic mechanic);

    Mechanic isNonActivatedMechanic(Integer id);
}

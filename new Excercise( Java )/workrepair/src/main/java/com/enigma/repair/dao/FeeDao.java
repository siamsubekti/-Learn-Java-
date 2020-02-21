package com.enigma.repair.dao;

import com.enigma.repair.model.Fee;

public interface FeeDao {

    Fee calculatePrice(Fee fee);
}

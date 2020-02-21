package com.enigma.mandiri.service;

import com.enigma.mandiri.model.Blood;

import java.util.List;

public interface BloodService {

    List<Blood> findAllBlood();

    Blood addBlood(Blood blood);
}

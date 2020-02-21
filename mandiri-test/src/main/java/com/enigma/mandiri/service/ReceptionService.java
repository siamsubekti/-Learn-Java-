package com.enigma.mandiri.service;

import com.enigma.mandiri.model.Reception;

import java.util.List;

public interface ReceptionService {

    List<Reception> findAllReception();
    Reception saveReception(Reception reception);
    Reception findByReceptionId(String id);
}

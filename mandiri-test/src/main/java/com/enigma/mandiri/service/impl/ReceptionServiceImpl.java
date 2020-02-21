package com.enigma.mandiri.service.impl;

import com.enigma.mandiri.model.Reception;
import com.enigma.mandiri.repository.ReceptionRepository;
import com.enigma.mandiri.service.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    ReceptionRepository receptionRepository;

    @Override
    public List<Reception> findAllReception() {
        return receptionRepository.findAll();
    }

    @Override
    public Reception saveReception(Reception receptions) {
        return receptionRepository.save(receptions);
    }

    @Override
    public Reception findByReceptionId(String id) {
        return receptionRepository.findById(id).get();
    }
}

package com.enigma.mandiri.service.impl;

import com.enigma.mandiri.model.Blood;
import com.enigma.mandiri.repository.BloodRepository;
import com.enigma.mandiri.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodServiceImpl implements BloodService {

    @Autowired
    BloodRepository bloodRepository;

    @Override
    public List<Blood> findAllBlood() {
        return bloodRepository.findAll();
    }

    @Override
    public Blood addBlood(Blood blood) {
        return bloodRepository.save(blood);
    }


}

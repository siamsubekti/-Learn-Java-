package com.enigma.mandiri.service.impl;

import com.enigma.mandiri.model.Donor;
import com.enigma.mandiri.repository.DonorRepository;
import com.enigma.mandiri.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    DonorRepository donorRepository;

    @Override
    public List<Donor> findAllDonor() {
        return  donorRepository.findAll();
    }

    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    @Override
    public Donor findByDonorId(String id) {
        return donorRepository.findById(id).get();
    }
}

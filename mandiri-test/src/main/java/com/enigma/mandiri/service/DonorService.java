package com.enigma.mandiri.service;

import com.enigma.mandiri.model.Donor;

import java.util.List;

public interface DonorService {

    List<Donor> findAllDonor();
    Donor saveDonor(Donor donor);
    Donor findByDonorId(String id);
}

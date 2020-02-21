package com.enigma.mandiri.controller;

import com.enigma.mandiri.model.Donor;
import com.enigma.mandiri.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonorController {

    @Autowired
    DonorService donorService;

    @GetMapping("/donor")
    public List<Donor> getAllDonor(){
        return donorService.findAllDonor();
    }

    @PostMapping("/donor")
    public Donor addDonor(@RequestBody Donor donor){
        return donorService.saveDonor(donor);
    }

    @GetMapping("/donor/{id}")
    public Donor getDonorById(@PathVariable String id){
        return donorService.findByDonorId(id);
    }
}

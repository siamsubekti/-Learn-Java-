package com.enigma.mandiri.controller;


import com.enigma.mandiri.model.Blood;
import com.enigma.mandiri.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BloodController {

    @Autowired
    BloodService bloodService;

    @GetMapping("/blood")
    public List<Blood> getAllBlood(){
        return bloodService.findAllBlood();
    }

    @PostMapping("/blood")
    public Blood addBlood(@RequestBody Blood blood){
        return bloodService.addBlood(blood);
    }
}

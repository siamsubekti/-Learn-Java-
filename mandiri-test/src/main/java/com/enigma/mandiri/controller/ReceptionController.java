package com.enigma.mandiri.controller;

import com.enigma.mandiri.model.Reception;
import com.enigma.mandiri.service.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReceptionController {

    @Autowired
    ReceptionService receptionService;

    @GetMapping("/reception")
    public List<Reception> getAllReception(){
        return receptionService.findAllReception();
    }

    @GetMapping("/reception/{id}")
    public Reception findByIdReception(@PathVariable String id){
        return receptionService.findByReceptionId(id);
    }

    @PostMapping("/reception")
    public Reception addReception(@RequestBody Reception reception){
        return receptionService.saveReception(reception);
    }

    @PutMapping("/reception/{id}")
    public Reception updateReception(@RequestBody Reception reception){
        return receptionService.saveReception(reception);
    }
}

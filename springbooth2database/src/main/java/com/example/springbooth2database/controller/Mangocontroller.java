package com.example.springbooth2database.controller;

import com.example.springbooth2database.service.Mangoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Mangocontroller {
    @Autowired
    private Mangoservice service;

//    @GetMapping("/mango")
//    public ResponseEntity<ArrayList<Mango>> getall() {
//    }
}

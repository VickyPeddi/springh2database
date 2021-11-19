package com.example.springbooth2database.controller;

import com.example.springbooth2database.model.Mango;
import com.example.springbooth2database.service.Mangoservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mango")
public class Homecontroller {


    private Mangoservice service;

    @GetMapping("/")
    public ResponseEntity<?> getallMangos() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getallmangos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getoneMango(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getonemango(id));
    }

    @PostMapping("/")
    public ResponseEntity<?> saveMano(@RequestBody Mango mango) {
        Mango mango1 = service.savemango(mango);
        return ResponseEntity.status(HttpStatus.OK).body(mango1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMango(@PathVariable("id") int id, Mango mango) {
        service.deletemango(id);
        return ResponseEntity.status(HttpStatus.OK).body(mango);
    }
}

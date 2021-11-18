package com.example.springbooth2database.service;

import com.example.springbooth2database.dao.Mangodao;
import com.example.springbooth2database.model.Mango;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Mangoservice {
    private Mangodao repos;

    public Mango getonemango(int id) {

        return repos.findById(id).get();
    }

    public List<Mango> getallmangos() {


        return repos.findAll();
    }

    public void deletemango(int id) {
        repos.deleteById(id);
    }


    public Mango savemango(Mango mango) {

        return repos.save(mango);
    }
}

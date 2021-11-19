package com.example.springbooth2database.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.springbooth2database.dao.Mangodao;
import com.example.springbooth2database.model.Mango;

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

	public Mango finduserbyusername(String username) {
		return repos.findMangobyUsername(username);
	}
}

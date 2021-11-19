package com.example.springbooth2database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbooth2database.model.Mango;

@Repository
public interface Mangodao extends JpaRepository<Mango, Integer> {
	public Mango findMangobyUsername(String username);
}

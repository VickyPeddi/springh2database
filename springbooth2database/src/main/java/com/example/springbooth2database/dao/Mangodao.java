package com.example.springbooth2database.dao;

import com.example.springbooth2database.model.Mango;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mangodao extends JpaRepository<Mango, Integer> {
}

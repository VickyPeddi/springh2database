package com.example.springbooth2database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbooth2database.service.Mangoservice;

@RestController

public class Mangocontroller {
	@Autowired
	private Mangoservice service;

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
}

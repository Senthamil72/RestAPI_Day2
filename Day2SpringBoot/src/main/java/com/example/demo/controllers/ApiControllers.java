package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {
	@Value("${name}")
	private String name;
	@GetMapping("/name")
	public String Display()
	{
		return name;
	}
}


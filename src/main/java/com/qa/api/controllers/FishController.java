package com.qa.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qa.api.domain.Fishes;
import com.qa.api.services.FishService;

@RestController

public class FishController {
	private FishService service;

	public FishController(FishService service) {
		this.service = service;
	}

	private List<Fishes> fishes = new ArrayList<>();
	
	@GetMapping("/catchAll") 
		public List<Fishes> catchAll() {
		return fishes;
	}
	
	@GetMapping("catchById/{id}")
	public Fishes catchById(@PathVariable long id) {
		return fishes.get((int)id);
	}
	
}

package com.qa.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.qa.api.services.FishService;

@RestController

public class FishController {
	private FishService service;

	public FishController(FishService service) {
		this.service = service;
	}
	
	private List<Fish> fishes = new ArrayList<>();
}

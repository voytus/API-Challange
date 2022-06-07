package com.qa.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.qa.api.services.FishService;

@RestController

public class FishController {
	private FishService service;

	public FishController(FishService service) {
		this.service = service;
	}
}

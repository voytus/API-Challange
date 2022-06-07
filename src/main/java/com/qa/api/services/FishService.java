package com.qa.api.services;

import com.qa.api.repo.FishRepo;

public class FishService {
	private FishRepo repo;

	public FishService(FishRepo repo) {
		this.repo = repo;
	}
}

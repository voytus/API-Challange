package com.qa.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.api.domain.Fishes;

public interface FishRepo extends JpaRepository<Fishes, Long> {

}

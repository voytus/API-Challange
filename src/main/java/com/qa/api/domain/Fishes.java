package com.qa.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fishes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// properties of java class
	@Column(name = "fishname", nullable = false)
	private String fishName;

	@Column(nullable = false)
	private String fishSpieces;

	@Column(nullable = false)
	private String fishNickname;

	// Empty constructor
	public Fishes() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	public String getFishSpieces() {
		return fishSpieces;
	}

	public void setFishSpieces(String fishSpieces) {
		this.fishSpieces = fishSpieces;
	}

	public String getFishNickname() {
		return fishNickname;
	}

	public void setFishNickname(String fishNickname) {
		this.fishNickname = fishNickname;
	}

}

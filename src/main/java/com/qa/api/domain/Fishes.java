package com.qa.api.domain;

import java.util.Objects;

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

	// Default - empty constructor
	public Fishes() {
	}

	// create constructor to read from a database
	public Fishes(long id, String fishName, String fishSpieces, String fishNickname) {
		super();
		this.id = id;
		this.fishName = fishName;
		this.fishSpieces = fishSpieces;
		this.fishNickname = fishNickname;
	}

	// create constructor to write(insert) into a database
	public Fishes(String fishName, String fishSpieces, String fishNickname) {
		super();
		this.fishName = fishName;
		this.fishSpieces = fishSpieces;
		this.fishNickname = fishNickname;
	}

	// Getters and setters

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

	// HashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(fishName, fishNickname, fishSpieces, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fishes other = (Fishes) obj;
		return Objects.equals(fishName, other.fishName) && Objects.equals(fishNickname, other.fishNickname)
				&& Objects.equals(fishSpieces, other.fishSpieces) && id == other.id;
	}

}

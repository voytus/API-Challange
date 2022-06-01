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

	@Column(name = "fishname", nullable = false)
	private String fishName;

	@Column(nullable = false)
	private String fishSpieces;

	@Column(nullable = false)
	private String fishNickname;

}

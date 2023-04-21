package com.ucolab.api.model.dao;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Card {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cardId;

	private String name;

	private String email;

	private String billingAddress;

	public Integer getCardId() {
		return cardId;
	}

	public void setUserId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
}

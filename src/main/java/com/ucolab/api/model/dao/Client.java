package com.ucolab.api.model.dao;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer clientId;

	private String username;

	private String email;

	private String phone;

	private Boolean status;

	public Integer getUserId() {
		return clientId;
	}

	public void setUserId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}

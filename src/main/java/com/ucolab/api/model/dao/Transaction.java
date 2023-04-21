package com.ucolab.api.model.dao;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer transactionId;

	private String type;

	private Float amount;

	private Date dateAdded;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setAmount(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
}

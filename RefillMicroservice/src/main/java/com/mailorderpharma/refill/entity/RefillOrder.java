package com.mailorderpharma.refill.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
//import java.util.Date;
//
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class RefillOrder {
	
	/**
	 * Refill id
	 */
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	/**
	 * Refill date 
	 */
	LocalDate refilledDate;
	/**
	 * Pay status
	 */
	private Boolean payStatus;
	/**
	 * Subscription id
	 */
	private long subId;
	/**
	 * Quantity to refill
	 */
	int quantity;
	/**
	 * Member id
	 */
	String memberId;
	
	public RefillOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RefillOrder(long id, LocalDate refilledDate, Boolean payStatus, long subId, int quantity, String memberId) {
		super();
		this.id = id;
		this.refilledDate = refilledDate;
		this.payStatus = payStatus;
		this.subId = subId;
		this.quantity = quantity;
		this.memberId = memberId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getRefilledDate() {
		return refilledDate;
	}

	public void setRefilledDate(LocalDate refilledDate) {
		this.refilledDate = refilledDate;
	}

	public Boolean getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
	}

	public long getSubId() {
		return subId;
	}

	public void setSubId(long subId) {
		this.subId = subId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "RefillOrder [id=" + id + ", refilledDate=" + refilledDate + ", payStatus=" + payStatus + ", subId="
				+ subId + ", quantity=" + quantity + ", memberId=" + memberId + "]";
	}

	
	
}

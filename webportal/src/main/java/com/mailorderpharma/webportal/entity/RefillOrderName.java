package com.mailorderpharma.webportal.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

/**Model class for the business details*/
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class RefillOrderName {
	
	/**
	 * Refill id
	 */
	
	long id;
	/**
	 * Refill date 
	 */
	private String drugName;
	
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
	public RefillOrderName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RefillOrderName(long id, String drugName, LocalDate refilledDate, Boolean payStatus, long subId,
			int quantity, String memberId) {
		super();
		this.id = id;
		this.drugName = drugName;
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
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
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
		return "RefillOrderName [id=" + id + ", drugName=" + drugName + ", refilledDate=" + refilledDate
				+ ", payStatus=" + payStatus + ", subId=" + subId + ", quantity=" + quantity + ", memberId=" + memberId
				+ "]";
	}
	
	

}

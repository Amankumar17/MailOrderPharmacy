package com.mailorderpharma.drugservice.entity;

import java.util.Date;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Stock {
	private String drugId;
	private String drugName;
	private Date expiryDate;
	private int stocks;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stock(String drugId, String drugName, Date expiryDate, int stocks) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.expiryDate = expiryDate;
		this.stocks = stocks;
	}

	public String getDrugId() {
		return drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Stock [drugId=" + drugId + ", drugName=" + drugName + ", expiryDate=" + expiryDate + ", stocks="
				+ stocks + "]";
	}
	
	
	
}

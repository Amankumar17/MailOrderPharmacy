package com.mailorderpharma.drugservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class DrugDetails {

	
	@Id
	private String drugId;
	private String drugName;
	private String manufacturer;
	private Date manufactureDate;
	private Date expiryDate;
	@OneToMany(mappedBy="drugDetails")
	private List<DrugLocationDetails> druglocationQuantities = new ArrayList<>();
	
	public DrugDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DrugDetails(String drugId, String drugName, String manufacturer, Date manufactureDate, Date expiryDate,
			List<DrugLocationDetails> druglocationQuantities) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.manufacturer = manufacturer;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.druglocationQuantities = druglocationQuantities;
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public List<DrugLocationDetails> getDruglocationQuantities() {
		return druglocationQuantities;
	}
	public void setDruglocationQuantities(List<DrugLocationDetails> druglocationQuantities) {
		this.druglocationQuantities = druglocationQuantities;
	}
	@Override
	public String toString() {
		return "DrugDetails [drugId=" + drugId + ", drugName=" + drugName + ", manufacturer=" + manufacturer
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + ", druglocationQuantities="
				+ druglocationQuantities + "]";
	}
	
	
}


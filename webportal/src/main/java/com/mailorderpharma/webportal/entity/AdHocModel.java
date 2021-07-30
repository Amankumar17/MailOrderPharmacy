package com.mailorderpharma.webportal.entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class AdHocModel {

	private int quantity;
	private String location;
	private boolean paymentStatus;
	public AdHocModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdHocModel(int quantity, String location, boolean paymentStatus) {
		super();
		this.quantity = quantity;
		this.location = location;
		this.paymentStatus = paymentStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "AdHocModel [quantity=" + quantity + ", location=" + location + ", paymentStatus=" + paymentStatus + "]";
	}
	
	
}
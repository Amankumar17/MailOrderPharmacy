package com.mailorderpharma.webportal.entity;

import java.util.Date;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class LocationModel {
	Date date;

	public LocationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocationModel(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "LocationModel [date=" + date + "]";
	}
	
	
}

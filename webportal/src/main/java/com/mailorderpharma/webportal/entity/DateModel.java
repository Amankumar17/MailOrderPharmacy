package com.mailorderpharma.webportal.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class DateModel {
	 @DateTimeFormat(pattern = "yyyy-mm-dd")
	Date date;

	public DateModel(Date date) {
		super();
		this.date = date;
	}

	public DateModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DateModel [date=" + date + "]";
	}
	 
	 
}

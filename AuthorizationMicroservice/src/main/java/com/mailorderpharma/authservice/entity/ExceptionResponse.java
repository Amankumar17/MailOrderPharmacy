package com.mailorderpharma.authservice.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class ExceptionResponse {
	
	/**
	 *Response message
	 */
	String message;
	/**
	 *Response date 
	 */
	LocalDateTime date;
	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponse(String message, LocalDateTime date) {
		super();
		this.message = message;
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [message=" + message + ", date=" + date + "]";
	}
	
	

}

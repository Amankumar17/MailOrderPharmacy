package com.mailorderpharma.drugservice.entity;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class ResponseForException {

	String messge;
	LocalDateTime timestamp;
	HttpStatus status;
	public ResponseForException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseForException(String messge, LocalDateTime timestamp, HttpStatus status) {
		super();
		this.messge = messge;
		this.timestamp = timestamp;
		this.status = status;
	}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ResponseForException [messge=" + messge + ", timestamp=" + timestamp + ", status=" + status + "]";
	}
	
	
}

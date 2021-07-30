package com.mailorderpharma.drugservice.entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class ResponseForSuccess {
	private String responseMessage;

	public ResponseForSuccess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseForSuccess(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	@Override
	public String toString() {
		return "ResponseForSuccess [responseMessage=" + responseMessage + "]";
	}
	
	
}

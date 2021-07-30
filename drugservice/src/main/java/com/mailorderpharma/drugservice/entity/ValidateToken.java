package com.mailorderpharma.drugservice.entity;

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
public class ValidateToken {
	private String uid;
	private String name;
	private boolean isValid;
	
	public ValidateToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidateToken(String uid, String name, boolean isValid) {
		super();
		this.uid = uid;
		this.name = name;
		this.isValid = isValid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "ValidateToken [uid=" + uid + ", name=" + name + ", isValid=" + isValid + "]";
	}
	
	
}

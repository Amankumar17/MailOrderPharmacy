package com.mailorderpharma.authservice.entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


/**Model class for the business details*/
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class AuthResponseEntity {
	/**
	 *Id for user 
	 */
	private String uid;
	/**
	 *Name of the user
	 */
	private String name;
	/**
	 *Validity check
	 */
	private boolean isValid;
	public AuthResponseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthResponseEntity(String uid, String name, boolean isValid) {
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
		return "AuthResponseEntity [uid=" + uid + ", name=" + name + ", isValid=" + isValid + "]";
	}
	
	
}

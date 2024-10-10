package com.hotel.bookings.DTO;

public class UserDto {

	private String emailId;
	private String name;
	private String password;
	private String role;
	
	
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDto(String emailId, String name, String password, String role) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.role = role;
	}


	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDto [emailId=" + emailId + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	
	
}

package com.hotel.bookings.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name= "User_table")
public class User {

	@Id
	@Column(unique = true)
	private String emailId;
	@Column(unique = true, length = 20)
	private String name;
	private String password;
	private String role;
	
	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	private List<Hotels> hotels;
	

	public User() {
		super();
	}
		
	public User(String emailId, String name, String password, String address, long contact) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String address;
	private long contact;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId= emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	
	

	
	
	
	
}

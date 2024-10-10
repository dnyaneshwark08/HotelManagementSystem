package com.hotel.bookings.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hotel_table")
public class Hotels {

	@Id
	private int id;
	private String hotelName;
	private String city;
	private String state;
	
	@Column(name = "Date", nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date bookingDate= new Date();
	private String category;
	private String subCategory;
	@Embedded
	private Support support;
	
	@ManyToOne
	@JoinColumn(name="emailId")
	private User user;
	
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hotels(int id, String hotelName, String city, String state) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.state = state;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Date getBookingDate() {
		return bookingDate;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getEmailId() {
		return user.getEmailId();	
		}
	
	public String getName() {
		return user.getName();
	}

	@Override
	public String toString() {
		return "Hotels [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", state=" + state + ", bookingDate="
				+ bookingDate + ", category=" + category + 
				", subCategory=" + subCategory + ", userId=" + getEmailId() + ", User name=" + getName() + "]";
	}

	
	
	
	
}

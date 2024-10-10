package com.hotel.bookings.DTO;

import com.hotel.bookings.entity.Status;
import com.hotel.bookings.entity.Support;

public class HotelsRequestDto {

	private int id;
	private String hotelName;
	private String city;
	private Support support;
	private String comments;
	private String emailId;
	private String name;
	private Status status;
	private String category;
	private String subCategory;
	
	
	public HotelsRequestDto() {

	}
	
	public HotelsRequestDto(int id, String hotelName, String city, Support support, String comments, String emailId,
			String name, Status status, String category, String subCategory) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.support = support;
		this.comments = comments;
		this.emailId = emailId;
		this.name = name;
		this.status = status;
		this.category = category;
		this.subCategory = subCategory;
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
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
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
	@Override
	public String toString() {
		return "HotelsRequestDto [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", support=" + support
				+ ", category=" + category + ", subCategory=" + subCategory + "]";
	}
}

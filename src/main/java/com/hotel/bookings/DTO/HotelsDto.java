package com.hotel.bookings.DTO;

import com.hotel.bookings.entity.Support;
import com.hotel.bookings.entity.User;

public class HotelsDto {

	private int id;
	private String hotelName;
	private String city;
	private Support support;
	private User user;
	private String category;
	private String subCategory;
	public HotelsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelsDto(int id, String hotelName, String city, Support support, User user, String category,
			String subCategory) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.support = support;
		this.user = user;
		this.category = category;
		this.subCategory = subCategory;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
		return "HotelsDto [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", support=" + support
				+ ", user=" + user + ", category=" + category + ", subCategory=" + subCategory + "]";
	}
	
	
}

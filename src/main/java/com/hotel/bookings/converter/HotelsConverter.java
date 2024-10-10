package com.hotel.bookings.converter;

import com.hotel.bookings.DTO.HotelsDto;
import com.hotel.bookings.DTO.HotelsRequestDto;
import com.hotel.bookings.entity.Hotels;
import com.hotel.bookings.entity.Support;
import com.hotel.bookings.entity.User;

public class HotelsConverter {

	private HotelsConverter() {
		
	}
	
	public static Hotels hotelsDtoToEntity(HotelsDto hotelsDto) {
		Hotels hotels = new Hotels();
		hotels.setId(hotelsDto.getId());
		hotels.setHotelName(hotelsDto.getHotelName());
		hotels.setCity(hotelsDto.getCity());
		hotels.setState(hotelsDto.getCity());
		hotels.setCategory(hotelsDto.getCategory());
		hotels.setSubCategory(hotelsDto.getSubCategory());
		hotels.setUser(hotelsDto.getUser());
		hotels.setSupport(hotelsDto.getSupport());
		
		return hotels;
	}
	
	public static Hotels updateHotelsDtoToEntity(HotelsRequestDto hotelsRequestDto)
	{
		Hotels hotels = new Hotels();
		Support support = new Support();
		
		support.setStatus(hotelsRequestDto.getStatus());
		support.setComments(hotelsRequestDto.getComments());
		hotels.setId(hotelsRequestDto.getId());
		hotels.setHotelName(hotelsRequestDto.getHotelName());
		hotels.setCity(hotelsRequestDto.getCity());
		hotels.setState(hotelsRequestDto.getCity());
		hotels.setCategory(hotelsRequestDto.getCategory());
		hotels.setSubCategory(hotelsRequestDto.getSubCategory());
		hotels.setSupport(hotelsRequestDto.getSupport());
		User user = new User();
		user.setEmailId(hotelsRequestDto.getEmailId());
		user.setName(hotelsRequestDto.getName());
		hotels.setUser(user);
		
		
		return hotels;
		
	}
}

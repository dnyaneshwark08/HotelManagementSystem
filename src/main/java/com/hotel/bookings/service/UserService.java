package com.hotel.bookings.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.bookings.DTO.UserDto;
import com.hotel.bookings.converter.UserConverter;
import com.hotel.bookings.entity.User;
import com.hotel.bookings.repository.HotelRepo;
import com.hotel.bookings.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private HotelRepo hotelRepo;
	
	public boolean registerUser(UserDto userDto)
	{
		
		if(this.userRepo.existsByEmailId(userDto.getEmailId()));
		{
			
			throw new EntityNotFoundException("User already exists");	
		}
		
		

					
		
	}
	
	
	
}

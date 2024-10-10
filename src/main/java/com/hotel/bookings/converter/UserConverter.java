package com.hotel.bookings.converter;

import com.hotel.bookings.DTO.UserDto;
import com.hotel.bookings.DTO.UserRequestDto;
import com.hotel.bookings.entity.User;

public class UserConverter {

	private UserConverter() {
		
	}

	public static User userDtoToEntity(UserDto userDto)
	{
		User user = new User();
		user.setEmailId(userDto.getEmailId());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());
		
		return user;
	}
	
	public static User updateUserDtoToEntity(UserRequestDto userRequestDto)
	{
		User user = new User();
		user.setEmailId(userRequestDto.getEmailId());
		user.setName(userRequestDto.getName());
		user.setPassword(userRequestDto.getPassword());
		
		return user;
	}
	
	
}

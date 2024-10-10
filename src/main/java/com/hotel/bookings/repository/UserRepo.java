package com.hotel.bookings.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.bookings.entity.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	
	public Optional<User> findByEmailId(String EmailId);
	
	public Boolean existsByEmailId(String EmailId);
	
	public Optional<User> findByName(String name);
}

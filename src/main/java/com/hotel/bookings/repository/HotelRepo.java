package com.hotel.bookings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotel.bookings.entity.Hotels;
import com.hotel.bookings.entity.User;

public interface HotelRepo extends JpaRepository<Hotels, Integer>
{
	@Query
	(nativeQuery = true,value = "select * from dnyaneshwardb.hotel_table")
	public List<Hotels> allHotels();
	
	public List<Hotels> findByUser(User user);
	
	@Query
	(nativeQuery = true, value= "select * from dnyaneshwardb.hotel_table where comments=' Booked ' AND status=' Booked 'AND emailId=?")
	public List<Hotels> getHotelBookingInProcess(User emailId);
	
	@Query(nativeQuery = true, value= "select * from dnyaneshwardb.hotel_table where emailId=?")
	public List<Hotels> findAllByEmailId(User emailId);
	
	
	
	
}

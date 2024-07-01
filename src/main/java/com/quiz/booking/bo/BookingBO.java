package com.quiz.booking.bo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.booking.domain.Booking;
import com.quiz.booking.mapper.BookingMapper;

@Service
public class BookingBO {
	
	@Autowired
	private BookingMapper bookingMapper;
	
	public List<Booking> getBookingList() {
		return bookingMapper.selectBookingList();
	}
	
	//  input:  id
	// output: int
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
		
	public void addBooking(String name, LocalDate date, int day, int headcount, String phoneNumber) {
		
		bookingMapper.insertBooking(name, date, day, headcount, phoneNumber);
	}
	
	public void getCheckBooking(String name, String phoneNumber) {
		bookingMapper.selectCheckBooking(name, phoneNumber);
	}
}

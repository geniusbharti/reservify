package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.BookDto;
import com.main.BookMovieShow.Response.BookingResponse;
import com.main.BookMovieShow.Service.BookService;

@RestController
@RequestMapping("/api/bookings")
public class BookController {
	
		@Autowired
		BookService bookService;
		
		//API to get booking details by id
		@GetMapping("/{bookingId}")
		public ResponseEntity<BookDto> getBookingDetails(@PathVariable Long bookingId){
			BookDto bookDto =  bookService.getBookingById(bookingId);
			return ResponseEntity.ok(bookDto);
		}
		
	 	// API to book seats for a show
	    @PutMapping("/users/{userId}/shows/{showId}/seats")
	    public ResponseEntity<BookingResponse> bookSeatsForUser(
	            @PathVariable Long userId,
	            @PathVariable Long showId,
	            @RequestBody List<Long> seatIds) {
	        // Logic to book seats for the specified user and show
	        BookingResponse bookingResponse = bookService.bookSeatsForUser(userId, showId, seatIds);
	        return ResponseEntity.ok(bookingResponse);
	    }
}

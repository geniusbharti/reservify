package com.main.BookMovieShow.Service;


import java.util.List;

import com.main.BookMovieShow.Dto.BookDto;
import com.main.BookMovieShow.Response.BookingResponse;

public interface BookService {
	
    BookDto getBookingById(Long bookId);
    void cancelBooking(Long bookId);  
	BookingResponse bookSeatsForUser(Long userId, Long showId, List<Long> seatIds);
    

}

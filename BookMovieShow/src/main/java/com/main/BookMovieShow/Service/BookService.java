package com.main.BookMovieShow.Service;


import java.util.List;

import com.main.BookMovieShow.Dto.BookDto;

public interface BookService {
	//method names by you //you want to have those apis
    BookDto createBooking(BookDto bookDto);
    BookDto getBookingById(Long bookId);
    void cancelBooking(Long bookId);
    List<BookDto> getUserBookings(Long userId);
	void bookSeatsForShowOnScreen(Long screenId, Long showId, List<Long> seatIds);
    

}

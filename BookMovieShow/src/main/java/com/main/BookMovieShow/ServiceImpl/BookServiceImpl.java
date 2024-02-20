package com.main.BookMovieShow.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.BookDto;
import com.main.BookMovieShow.Entity.Book;
import com.main.BookMovieShow.Repository.BookRepository;
import com.main.BookMovieShow.Service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
    private BookRepository bookRepository;
	
	@Override
	public BookDto createBooking(BookDto bookDto) {
		// TODO Auto-generated method stub
		// Custom method to prepare the entity from DTO
//        Book booking = prepareBookEntity(bookDto);

        // Perform business logic or validation

        // Save the booking entity
//        Book savedBooking = bookRepository.save(booking);

        // Custom method to prepare DTO from the saved entity
//        return prepareBookDto(savedBooking);
		return null;
	}

	@Override
	public BookDto getBookingById(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBooking(Long bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookDto> getUserBookings(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bookSeatsForShowOnScreen(Long screenId, Long showId, List<Long> seatIds) {
		// TODO Auto-generated method stub
		
	}
  
}

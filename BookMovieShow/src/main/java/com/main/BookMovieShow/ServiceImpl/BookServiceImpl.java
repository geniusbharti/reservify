package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.BookDto;
import com.main.BookMovieShow.Entity.Book;
import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Entity.User;
import com.main.BookMovieShow.Enum.SeatType;
import com.main.BookMovieShow.Repository.BookRepository;
import com.main.BookMovieShow.Repository.SeatRepository;
import com.main.BookMovieShow.Repository.ShowRepository;
import com.main.BookMovieShow.Repository.UserRepository;
import com.main.BookMovieShow.Response.BookingResponse;
import com.main.BookMovieShow.Service.BookService;
import com.main.BookMovieShow.exception.NoSuchBookingExistsException;
import com.main.BookMovieShow.exception.OptimisticLockingException;

import jakarta.transaction.Transactional;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
    private BookRepository bookRepository;
	
	@Autowired
	private SeatRepository seatRepository;
	
	@Autowired
	private ShowRepository showRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	//To get a booking by id
	@Override
	public BookDto getBookingById(Long bookId) {
		Optional<Book> bookingDetails = bookRepository.findById(bookId);
		if(bookingDetails.isPresent()) {
			Book booking = bookingDetails.get();
			BookDto bookDto = Book.prepareBookDTO(booking);
			return bookDto;
		}
		
		else throw new NoSuchBookingExistsException(bookId);
	}
	

	
    //--------------------------- BOOKING LOGIC API ------------------------------------------
	@Override
	@Transactional
	public BookingResponse bookSeatsForUser(Long userId, Long showId, List<Long> seatIds) {
     	//you have to just change the seat status of given selected seats to BOOKED
		//also add details of booking once booked
		 try {
			    
			    //BOOK SEATS FOR USER
				int rowsAffected = bookRepository.bookSeatsForUserWithLock(showId, seatIds);
				 if (rowsAffected != seatIds.size()) {
			            throw new OptimisticLockingException("Seats have been booked by another user. Please try again!");
			        }
				
				//CREATE BOOKING 
				bookRepository.createBooking(seatIds.size(), userId, showId);
				

				//CREATE BOOKING RESPONSE OR TICKET
				BookingResponse bookingResponse = new BookingResponse();
				Show showObject = showRepository.findById(showId).get();
				User userObject = userRepository.findById(userId).get();
				bookingResponse.setAmountPaid(calculateAmountPaid(seatIds));
				bookingResponse.setUser(userObject);
				bookingResponse.setQuantity(seatIds.size());
				bookingResponse.setSeatIds(seatIds);
				bookingResponse.setMovie(showObject.getMovie());
				bookingResponse.setShowStartTime(showObject.getStartTime());
				bookingResponse.setShowEndTime(showObject.getEndTime());
				bookingResponse.setTheater(showObject.getTheater());
				bookingResponse.setSuccessMessage("Your Tickets are Confirmed!");
					
				return bookingResponse; 
				
		 }
		
		catch (ObjectOptimisticLockingFailureException ex) {
            // Handle optimistic locking exception (e.g., retry or inform the user)
            throw new OptimisticLockingException("Seats have been booked by another user. Please try again.");
        }
		 
	}
	
	private double calculateAmountPaid(List<Long> seatIds) {
        double totalAmount = 0.0;

        for (Long seatId : seatIds) {
            Optional<Seat> seatOpt = seatRepository.findById(seatId);
            Seat seat = seatOpt.get();
            SeatType seatType = seat.getSeatType();
            double baseFare = seatType.getBaseFare();
            double fixedFare = seat.getSeatPrice();
            double seatAmount = baseFare + fixedFare;

            totalAmount += seatAmount;
        }

        return totalAmount;
    }
	
	//For Future Use Case 
	@Override
	public void cancelBooking(Long bookId) {
		// TODO Auto-generated method stub
	}
}

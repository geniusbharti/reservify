package com.main.BookMovieShow.Dto;

import java.time.LocalDateTime;
import java.util.List;

import com.main.BookMovieShow.Entity.Book;
import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Entity.User;

public class BookDto {
	private Long bookingId;
	private Show show;
	private User user;
	private List<Seat> seats;
	private LocalDateTime bookedTime;
	
	public BookDto() {}
	
	/**
	 * @param bookingId
	 * @param show
	 * @param user
	 * @param seats
	 * @param bookedTime
	 */
	public BookDto(Long bookingId, Show show, User user, List<Seat> seats, LocalDateTime bookedTime) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.user = user;
		this.seats = seats;
		this.bookedTime = bookedTime;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public LocalDateTime getBookedTime() {
		return bookedTime;
	}

	public void setBookedTime(LocalDateTime bookedTime) {
		this.bookedTime = bookedTime;
	}

	@Override
	public String toString() {
		return "BookDto [bookingId=" + bookingId + ", show=" + show + ", user=" + user + ", seats=" + seats
				+ ", bookedTime=" + bookedTime + "]";
	}
	
	
	public static Book prepareBookEntity(BookDto bookDto) {
		Book bookEntity = new Book();
		
		
		
		return bookEntity;
	}
	
	
}

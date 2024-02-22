package com.main.BookMovieShow.Dto;

import java.time.LocalDateTime;
import java.util.List;

import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Entity.User;

public class BookDto {
	private Long bookingId;
	private int quantity;
	private LocalDateTime bookedTime;
	private Show show;
	private User user;
	
	private List<Seat> seats;
	
	public BookDto() {}
	
	

	/**
	 * @param bookingId
	 * @param quantity
	 * @param bookedTime
	 * @param show
	 * @param user
	 * @param seats
	 */
	public BookDto(Long bookingId, int quantity, LocalDateTime bookedTime, Show show, User user, List<Seat> seats) {
		super();
		this.bookingId = bookingId;
		this.quantity = quantity;
		this.bookedTime = bookedTime;
		this.show = show;
		this.user = user;
		this.seats = seats;
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
		return "BookDto [bookingId=" + bookingId + ", quantity=" + quantity + ", bookedTime=" + bookedTime + ", show="
				+ show + ", user=" + user + ", seats=" + seats + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}

package com.main.BookMovieShow.Response;

import java.time.LocalDateTime;
import java.util.List;

import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Theater;
import com.main.BookMovieShow.Entity.User;

public class BookingResponse {
	private User user; //some specific details
    private Theater theater; //some specific details 
    private Movie movie; //some specific details 
    private double amountPaid;
    private LocalDateTime showStartTime;
    private LocalDateTime showEndTime;
    private LocalDateTime bookingDateAndTime;
    private List<Long> seatIds;
    private int quantity;  // Assuming you want to include the quantity of seats booked
    private String successMessage;
    
    
    public BookingResponse() {}
    
	

	/**
	 * @param user
	 * @param theater
	 * @param movie
	 * @param amountPaid
	 * @param showStartTime
	 * @param showEndTime
	 * @param bookingDateAndTime
	 * @param seatIds
	 * @param quantity
	 * @param successMessage
	 */
	public BookingResponse(User user, Theater theater, Movie movie, double amountPaid, LocalDateTime showStartTime,
			LocalDateTime showEndTime, LocalDateTime bookingDateAndTime, List<Long> seatIds, int quantity,
			String successMessage) {
		super();
		this.user = user;
		this.theater = theater;
		this.movie = movie;
		this.amountPaid = amountPaid;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.bookingDateAndTime = bookingDateAndTime;
		this.seatIds = seatIds;
		this.quantity = quantity;
		this.successMessage = successMessage;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	public List<Long> getSeatIds() {
		return seatIds;
	}

	public void setSeatIds(List<Long> seatIds) {
		this.seatIds = seatIds;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public LocalDateTime getBookingDateAndTime() {
		return bookingDateAndTime;
	}

	public void setBookingDateAndTime(LocalDateTime bookingDateAndTime) {
		this.bookingDateAndTime = bookingDateAndTime;
	}

}

package com.main.BookMovieShow.Dto;

import java.util.List;

import com.main.BookMovieShow.Entity.Book;
import com.main.BookMovieShow.Entity.Screen;
import com.main.BookMovieShow.Enum.ReserveStatusSeat;
import com.main.BookMovieShow.Enum.SeatType;

public class SeatDto {
	private Long seatId;
	private SeatType seatType;
	private double seatPrice;
	private ReserveStatusSeat seatStatus;
	private Screen screen;
	private List<Book> bookings;
	
	public SeatDto() {}
	
	
	/**
	 * @param seatId
	 * @param seatType
	 * @param seatPrice
	 * @param seatStatus
	 * @param screen
	 * @param bookings
	 */
	public SeatDto(Long seatId, SeatType seatType, double seatPrice, ReserveStatusSeat seatStatus, Screen screen,
			List<Book> bookings) {
		super();
		this.seatId = seatId;
		this.seatType = seatType;
		this.seatPrice = seatPrice;
		this.seatStatus = seatStatus;
		this.screen = screen;
		this.bookings = bookings;
	}


	@Override
	public String toString() {
		return "SeatDto [seatId=" + seatId + ", seatType=" + seatType + ", seatPrice=" + seatPrice + ", seatStatus="
				+ seatStatus + ", screen=" + screen + ", bookings=" + bookings + "]";
	}


	public Long getSeatId() {
		return seatId;
	}


	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}


	public SeatType getSeatType() {
		return seatType;
	}


	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}


	public double getSeatPrice() {
		return seatPrice;
	}


	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}


	public ReserveStatusSeat getSeatStatus() {
		return seatStatus;
	}


	public void setSeatStatus(ReserveStatusSeat seatStatus) {
		this.seatStatus = seatStatus;
	}


	public Screen getScreen() {
		return screen;
	}


	public void setScreen(Screen screen) {
		this.screen = screen;
	}


	public List<Book> getBookings() {
		return bookings;
	}


	public void setBookings(List<Book> bookings) {
		this.bookings = bookings;
	}
	
	
	
}

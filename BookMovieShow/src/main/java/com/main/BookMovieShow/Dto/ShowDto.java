package com.main.BookMovieShow.Dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.BookMovieShow.Entity.Book;
import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Screen;
import com.main.BookMovieShow.Entity.Theater;

import jakarta.persistence.OneToMany;

public class ShowDto {
	private Long showId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime startTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime endTime;
    private Movie movie;
   
    private Screen screen;
    @JsonIgnore
    private List<Book> bookings;
    @JsonIgnore
    private Theater theater;
    
    public ShowDto() {}

	/**
	 * @param showId
	 * @param startTime
	 * @param endTime
	 * @param movie
	 * @param screen
	 * @param bookings
	 */
	public ShowDto(Long showId, LocalDateTime startTime, LocalDateTime endTime, Movie movie, Screen screen,
			List<Book> bookings) {
		super();
		this.showId = showId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.movie = movie;
		this.screen = screen;
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "ShowDto [showId=" + showId + ", startTime=" + startTime + ", endTime=" + endTime + ", movie=" + movie
				+ ", screen=" + screen + ", bookings=" + bookings + "]";
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
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

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
    
    
}

package com.main.BookMovieShow.Dto;

import java.util.List;

import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;

public class ScreenDto {
	private Long screenId;
	private List<Seat> seats;
	private List<Show> shows;
	
	public ScreenDto() {}
	
	/**
	 * @param screenId
	 * @param seats
	 * @param shows
	 */
	public ScreenDto(Long screenId, List<Seat> seats, List<Show> shows) {
		super();
		this.screenId = screenId;
		this.seats = seats;
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "ScreenDto [screenId=" + screenId + ", seats=" + seats + ", shows=" + shows + "]";
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	
	
}

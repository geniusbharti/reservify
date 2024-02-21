package com.main.BookMovieShow.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Screen {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screenId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "screen")
	private List<Seat> seats;
	
	//---future---use----case----
	@JsonIgnore
    @OneToMany(mappedBy = "screen")
    private List<Show> shows;

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

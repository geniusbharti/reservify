package com.main.BookMovieShow.Entity;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.BookMovieShow.Dto.ShowDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_show_table") // Specify a different table name
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Long showId;
    
    @JsonIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime startTime;
    
    @JsonIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime endTime;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    
   
    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
    
    @JsonIgnore
    @OneToMany(mappedBy = "show")
    private List<Book> bookings;
    
    @JsonIgnore
    @ManyToOne // Add this annotation for the bidirectional relationship
    @JoinColumn(name = "theater_id")
    private Theater theater;
    
    
    public Show() {}
	/**
	 * @param showId
	 * @param startTime
	 * @param endTime
	 * @param movie
	 * @param screen
	 * @param bookings
	 * @param theater
	 */
	public Show(Long showId, LocalDateTime startTime, LocalDateTime endTime, Movie movie, Screen screen,
			List<Book> bookings, Theater theater) {
		super();
		this.showId = showId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.movie = movie;
		this.screen = screen;
		this.bookings = bookings;
		this.theater = theater;
	}
	
	
	
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", startTime=" + startTime + ", endTime=" + endTime + ", movie=" + movie
				+ ", screen=" + screen + ", bookings=" + bookings + ", theater=" + theater + "]";
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
    
	public static ShowDto prepareShowDTO(Show show) {
		ShowDto showDto = new ShowDto();
		showDto.setStartTime(show.getStartTime());
		showDto.setEndTime(show.getEndTime());
		showDto.setShowId(show.getShowId());
		showDto.setMovie(show.getMovie());
		showDto.setScreen(show.getScreen());
		showDto.setTheater(show.getTheater());
		return showDto;
	} 
	
	public static ShowDto prepareShowScreenDTO(Show show) {
		ShowDto showDto = new ShowDto();
		showDto.setScreen(show.getScreen());
		return showDto;
	} 

}

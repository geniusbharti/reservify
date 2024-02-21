package com.main.BookMovieShow.Entity;

import java.util.List;

import com.main.BookMovieShow.Dto.MovieDto;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Movie {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private Long movieId;
	
	private String title;
	
	@OneToMany(mappedBy = "movie")
    private List<Show> shows;
	
	private String genre;
	
	@Column(name = "duration_in_min")
	private int durationInMin;
	
	@ManyToOne // Add this annotation for the bidirectional relationship
    @JoinColumn(name = "theater_id")
    private Theater theater;
	
	private String country;
	
	private String language;
	
	private String rating;
	
	private String synopsis;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDurationInMin() {
		return durationInMin;
	}

	public void setDurationInMin(int durationInMin) {
		this.durationInMin = durationInMin;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public static MovieDto prepareMovieDTO(Movie movie) {
		MovieDto movieDto = new MovieDto();
		movieDto.setMovieId(movie.getMovieId());
		movieDto.setTitle(movie.getTitle());
		movieDto.setCountry(movie.getCountry());
		movieDto.setDurationInMin(movie.getDurationInMin());
		movieDto.setGenre(movie.getGenre());
		movieDto.setLanaguage(movie.getLanguage());
		movieDto.setRating(movie.getRating());
		movieDto.setSynopsis(movie.getSynopsis());
		return movieDto;
	}
	
}

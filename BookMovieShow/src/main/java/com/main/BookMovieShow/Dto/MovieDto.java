package com.main.BookMovieShow.Dto;

import java.util.List;

import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Entity.Theater;

public class MovieDto {
	private Long movieId;
	private List<Theater> theaters;
	private List<Show> shows;
	private String genre;
	private int durationInMin;
	private String country;
	private String title;
	

	private String lanaguage;
	
	private String rating;
	
	private String synopsis;
	
	public MovieDto() {}
	
	/**
	 * @param movieId
	 * @param theaters
	 * @param shows
	 * @param genre
	 * @param durationInMin
	 * @param country
	 * @param lanaguage
	 * @param rating
	 * @param synopsis
	 */
	public MovieDto(Long movieId, List<Theater> theaters, List<Show> shows, String genre, int durationInMin,
			String country, String lanaguage, String rating, String synopsis) {
		super();
		this.movieId = movieId;
		this.theaters = theaters;
		this.shows = shows;
		this.genre = genre;
		this.durationInMin = durationInMin;
		this.country = country;
		this.lanaguage = lanaguage;
		this.rating = rating;
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "MovieDto [movieId=" + movieId + ", theaters=" + theaters + ", shows=" + shows + ", genre=" + genre
				+ ", durationInMin=" + durationInMin + ", country=" + country + ", lanaguage=" + lanaguage + ", rating="
				+ rating + ", synopsis=" + synopsis + "]";
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public List<Theater> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanaguage() {
		return lanaguage;
	}

	public void setLanaguage(String lanaguage) {
		this.lanaguage = lanaguage;
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
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}

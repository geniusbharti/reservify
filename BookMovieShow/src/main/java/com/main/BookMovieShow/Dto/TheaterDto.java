package com.main.BookMovieShow.Dto;

import java.util.List;

import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Theater;

public class TheaterDto {
    private Long theaterId;
	private String theaterName;
    private String address;	
	private String city;
    private List<Movie> movies;
    
    public TheaterDto() {}
    
	/**
	 * @param theaterId
	 * @param theaterName
	 * @param address
	 * @param city
	 * @param movies
	 */
	public TheaterDto(Long theaterId, String theaterName, String address, String city, List<Movie> movies) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.address = address;
		this.city = city;
		this.movies = movies;
	}
	
	public Long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "TheaterDto [theaterId=" + theaterId + ", theaterName=" + theaterName + ", address=" + address
				+ ", city=" + city + ", movies=" + movies + "]";
	}
    
////    --we will ignore thus
//    private List<Show> shows;
    
	public static Theater prepareTheaterEntity(TheaterDto theaterDto) {
		Theater theater = new Theater();
		theater.setTheaterId(theaterDto.getTheaterId());
		theater.setCity(theaterDto.getCity());
		theater.setAddress(theaterDto.getAddress());
		theater.setTheaterName(theaterDto.getTheaterName());
		return theater;
		
	}
    
    
}

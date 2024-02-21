package com.main.BookMovieShow.Entity;

import java.util.List;

import com.main.BookMovieShow.Dto.TheaterDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theater_id")
	private Long theaterId;
	
    @Column(name = "theater_name")
	private String theaterName;
    
    private String address;	
    
	private String city;
    
    @OneToMany(mappedBy = "theater")
    private List<Movie> movies;
    
    @OneToMany(mappedBy = "theater")
    private List<Show> shows;

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
    
	public static TheaterDto prepareTheaterDTO(Theater theater) {
		 TheaterDto theaterDto = new TheaterDto();
		 theaterDto.setTheaterId(theater.getTheaterId());
		 theaterDto.setTheaterName(theater.getTheaterName());
		 theaterDto.setCity(theater.getCity());
		 theaterDto.setAddress(theater.getAddress());
		 return theaterDto;
	}    
	
}

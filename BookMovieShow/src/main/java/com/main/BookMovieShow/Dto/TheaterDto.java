package com.main.BookMovieShow.Dto;

import java.util.List;

import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Show;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class TheaterDto {
    private Long theaterId;
	private String theaterName;
    private String address;	
	private String city;
    private List<Movie> movies;
    
//    --we will ignore thus
    private List<Show> shows;
    
    
}

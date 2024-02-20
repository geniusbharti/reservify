package com.main.BookMovieShow.Entity;

import java.util.List;

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

	
}

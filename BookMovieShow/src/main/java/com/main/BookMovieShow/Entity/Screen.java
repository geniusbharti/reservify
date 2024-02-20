package com.main.BookMovieShow.Entity;

import java.util.List;

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
	
	@OneToMany(mappedBy = "screen")
	private List<Seat> seats;
	 
    @OneToMany(mappedBy = "screen")
    private List<Show> shows;
    
   
}

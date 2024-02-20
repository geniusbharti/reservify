package com.main.BookMovieShow.Entity;

import java.util.List;

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
	
	
	
}

package com.main.BookMovieShow.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long bookingId;

	    @ManyToOne
	    @JoinColumn(name = "show_id")
	    private Show show;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	     
	    private int quantity;
	    
	    @ManyToMany
	    @JoinTable(
	        name = "book_seat",
	        joinColumns = @JoinColumn(name = "booking_id"),
	        inverseJoinColumns = @JoinColumn(name = "seat_id")
	    )
	    private List<Seat> seats;
	    
	    private LocalDateTime bookedTime;


}

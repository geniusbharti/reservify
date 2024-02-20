package com.main.BookMovieShow.Entity;
import java.time.LocalDateTime;
import java.util.List;

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
    
    private LocalDateTime startTime;
    
    private LocalDateTime endTime;
    
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
 
    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
   
    @OneToMany(mappedBy = "show")
    private List<Book> bookings;
    

    @ManyToOne // Add this annotation for the bidirectional relationship
    @JoinColumn(name = "theater_id")
    private Theater theater;
    
    
}

package com.main.BookMovieShow.Entity;

import java.util.List;

import com.main.BookMovieShow.Enum.ReserveStatusSeat;
import com.main.BookMovieShow.Enum.SeatType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long seatId;

    // Other fields for Seat...
    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type")
    private SeatType seatType;
    
    @Column(name = "seat_price")
    private double seatPrice;
    
    @Enumerated(EnumType.STRING)
    private ReserveStatusSeat seatStatus;
    
    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @ManyToMany(mappedBy = "seats") // Add this annotation
    private List<Book> bookings; // Add this field

}

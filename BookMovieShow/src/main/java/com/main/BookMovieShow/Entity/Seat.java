package com.main.BookMovieShow.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Enum.ReserveStatusSeat;
import com.main.BookMovieShow.Enum.SeatType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

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
    @JsonIgnore
    private Screen screen;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "seats") // Add this annotation
    private List<Book> bookings; // Add this field
    
    @Version
    private Long version;
    
    public Seat() {}
    
	
	
	

	/**
	 * @param seatId
	 * @param seatType
	 * @param seatPrice
	 * @param seatStatus
	 * @param screen
	 * @param bookings
	 * @param version
	 */
	public Seat(Long seatId, SeatType seatType, double seatPrice, ReserveStatusSeat seatStatus, Screen screen,
			List<Book> bookings, Long version) {
		super();
		this.seatId = seatId;
		this.seatType = seatType;
		this.seatPrice = seatPrice;
		this.seatStatus = seatStatus;
		this.screen = screen;
		this.bookings = bookings;
		this.version = version;
	}


	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatType=" + seatType + ", seatPrice=" + seatPrice + ", seatStatus="
				+ seatStatus + ", screen=" + screen + ", bookings=" + bookings + ", version=" + version + "]";
	}

	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}

	public ReserveStatusSeat getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(ReserveStatusSeat seatStatus) {
		this.seatStatus = seatStatus;
	}
	@JsonIgnore
	public Screen getScreen() {
		return screen;
	}
	@JsonIgnore
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	@JsonIgnore
	public List<Book> getBookings() {
		return bookings;
	}
	
	@JsonIgnore
	public void setBookings(List<Book> bookings) {
		this.bookings = bookings;
	}
    
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
	public void refresh(EntityManager entityManager) {
        entityManager.refresh(this);
    }
	
	public static SeatDto prepareSeatDTO(Seat seat) {
		SeatDto seatDto = new SeatDto();
		seatDto.setScreen(seat.getScreen());
		seatDto.setSeatId(seat.getSeatId());
		seatDto.setSeatType(seat.getSeatType());
		seatDto.setSeatPrice(seat.getSeatPrice());
		seatDto.setSeatStatus(seat.getSeatStatus());
		return seatDto;
	} 
	
	
}

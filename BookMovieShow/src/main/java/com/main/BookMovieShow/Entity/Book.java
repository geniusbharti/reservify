package com.main.BookMovieShow.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.main.BookMovieShow.Dto.BookDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

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
	    
	    @Version 
	    private Long version;
	    
	    @ManyToMany
	    @JoinTable(
	        name = "book_seat",
	        joinColumns = @JoinColumn(name = "booking_id"),
	        inverseJoinColumns = @JoinColumn(name = "seat_id")
	    )
	    private List<Seat> seats;
	    
	    private LocalDateTime bookedTime;
	    
	    public Book() {}
		
		/**
		 * @param bookingId
		 * @param show
		 * @param user
		 * @param quantity
		 * @param version
		 * @param seats
		 * @param bookedTime
		 */
		public Book(Long bookingId, Show show, User user, int quantity, Long version, List<Seat> seats,
				LocalDateTime bookedTime) {
			super();
			this.bookingId = bookingId;
			this.show = show;
			this.user = user;
			this.quantity = quantity;
			this.version = version;
			this.seats = seats;
			this.bookedTime = bookedTime;
		}
		
		
		@Override
		public String toString() {
			return "Book [bookingId=" + bookingId + ", show=" + show + ", user=" + user + ", quantity=" + quantity
					+ ", version=" + version + ", seats=" + seats + ", bookedTime=" + bookedTime + "]";
		}

		public Long getBookingId() {
			return bookingId;
		}
		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
		}
		public Show getShow() {
			return show;
		}
		public void setShow(Show show) {
			this.show = show;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public List<Seat> getSeats() {
			return seats;
		}
		public void setSeats(List<Seat> seats) {
			this.seats = seats;
		}
		public LocalDateTime getBookedTime() {
			return bookedTime;
		}
		public void setBookedTime(LocalDateTime bookedTime) {
			this.bookedTime = bookedTime;
		}

		public Long getVersion() {
			return version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	    
		public static BookDto prepareBookDTO(Book booking) {
			BookDto bookingDto = new BookDto();
			bookingDto.setBookingId(booking.getBookingId());
			bookingDto.setUser(booking.getUser());
			bookingDto.setShow(booking.getShow());
			bookingDto.setBookedTime(booking.getBookedTime());
			bookingDto.setQuantity(booking.getQuantity());
			bookingDto.setSeats(booking.getSeats());
			return bookingDto;
		} 
		
		
}

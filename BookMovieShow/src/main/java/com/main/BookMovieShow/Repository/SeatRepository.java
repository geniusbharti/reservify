package com.main.BookMovieShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.BookMovieShow.Entity.Screen;
import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Enum.ReserveStatusSeat;

public interface SeatRepository extends JpaRepository<Seat, Long>{

	List<Seat> findByScreen(Screen screen);

	@Query("SELECT s FROM Seat s " +
	           "WHERE s.screen.screenId = :screenId " +
	           "AND s.seatStatus = :seatStatus")
	    List<Seat> findAvailableSeatsForScreen(
	        @Param("screenId") Long screenId,
	        @Param("seatStatus") ReserveStatusSeat seatStatus
	    );
	   
		
}

package com.main.BookMovieShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Enum.ReserveStatusSeat;

public interface ShowRepository extends JpaRepository<Show, Long>{
	@Query("SELECT s FROM Seat s " +
	           "WHERE s.screen IN (SELECT sh.screen FROM Show sh WHERE sh.showId = :showId) " +
	           "AND s.seatStatus = :seatStatus")
	    List<Seat> findAvailableSeatsForShow(
	        @Param("showId") Long showId,
	        @Param("seatStatus") ReserveStatusSeat seatStatus
	    );
	
	
		


	
}

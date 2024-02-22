package com.main.BookMovieShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.BookMovieShow.Entity.Book;
import jakarta.transaction.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
		@Modifying
		@Transactional
		@Query("UPDATE Seat s SET s.seatStatus = 'BOOKED', s.version = s.version + 1 " +
		       "WHERE s.screen IN (SELECT sh.screen FROM Show sh WHERE sh.showId = :showId) " +
		       "AND s.id IN :seatIds " +
		       "AND s.seatStatus = 'AVAILABLE'")
		int bookSeatsForUserWithLock(@Param("showId") Long showId,
		                              @Param("seatIds") List<Long> seatIds);

				

		@Modifying
		@Transactional
		@Query("INSERT INTO Book (bookedTime, quantity, user, show) " +
		       "SELECT CURRENT_TIMESTAMP, :quantity, u, s FROM User u, Show s WHERE u.id = :userId AND s.showId = :showId")
		void createBooking(@Param("quantity") int quantity,
		                   @Param("userId") Long userId,
		                   @Param("showId") Long showId);


}

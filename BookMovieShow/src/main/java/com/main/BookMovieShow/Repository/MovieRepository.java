package com.main.BookMovieShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.BookMovieShow.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	@Query("SELECT m FROM Movie m WHERE m.theater.theaterId = :theaterId")
    List<Movie> findByTheaterId(@Param("theaterId") Long theaterId);

}

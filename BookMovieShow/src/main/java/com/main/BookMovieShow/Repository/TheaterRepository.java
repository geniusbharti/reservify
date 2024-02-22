package com.main.BookMovieShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.BookMovieShow.Entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long>{
	
	// Using method naming convention
	List<Theater> findByCity(String city);

}

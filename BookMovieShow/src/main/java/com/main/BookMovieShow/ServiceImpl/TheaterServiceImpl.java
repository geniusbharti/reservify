package com.main.BookMovieShow.ServiceImpl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.TheaterDto;
import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Theater;
import com.main.BookMovieShow.Repository.MovieRepository;
import com.main.BookMovieShow.Repository.TheaterRepository;
import com.main.BookMovieShow.Service.TheaterService;

@Service
public class TheaterServiceImpl implements TheaterService{
	
	@Autowired
	TheaterRepository theaterRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public List<TheaterDto> getAllTheaters() {
		List<Theater> theaters = theaterRepository.findAll();
        return theaters.stream().map(Theater::prepareTheaterDTO).collect(Collectors.toList());
	}

	@Override
	public List<MovieDto> getMoviesInTheater(Long theaterId) {
		List<Movie> movies = movieRepository.findByTheaterId(theaterId);
		return movies.stream().map(Movie::prepareMovieDTO).collect(Collectors.toList());
	}

	@Override
	public List<TheaterDto> getTheatersByCity(String city) {
		List<Theater> theaters = theaterRepository.findByCity(city);
		return theaters.stream().map(Theater::prepareTheaterDTO).collect(Collectors.toList());
	}

	@Override
	public TheaterDto getTheaterById(Long theaterId) {
		 Optional<Theater> theater = theaterRepository.findById(theaterId);
		 Theater theaterEntity = theater.get();
		 TheaterDto theaterDto = Theater.prepareTheaterDTO(theaterEntity);
		 return theaterDto;
	}

}

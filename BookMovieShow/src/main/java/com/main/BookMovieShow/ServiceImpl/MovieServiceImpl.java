package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.ShowDto;
import com.main.BookMovieShow.Entity.Movie;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Repository.MovieRepository;
import com.main.BookMovieShow.Repository.ShowRepository;
import com.main.BookMovieShow.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	ShowRepository showRepository;
	
	@Override
	public MovieDto getMovieById(Long movieId) {
		Optional<Movie> movieOpt = movieRepository.findById(movieId);
		Movie movieEntity = movieOpt.get();
		MovieDto movieDto = Movie.prepareMovieDTO(movieEntity);
		return movieDto;
	}

	@Override
	public List<MovieDto> getAllMovies() {
		List<Movie> allMovies = movieRepository.findAll();
        return allMovies.stream().map(Movie::prepareMovieDTO).collect(Collectors.toList());
	}
	

}

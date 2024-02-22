package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.ShowDto;

public interface MovieService {

	MovieDto getMovieById(Long movieId);

	List<MovieDto> getAllMovies();

	

}

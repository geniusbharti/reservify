package com.main.BookMovieShow.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.ShowDto;
import com.main.BookMovieShow.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Override
	public MovieDto getMovieById(Long movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieDto> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShowDto> getShowsForMovie(Long movieId) {
		// TODO Auto-generated method stub
		return null;
	}

}

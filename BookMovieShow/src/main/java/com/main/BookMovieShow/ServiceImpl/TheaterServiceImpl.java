package com.main.BookMovieShow.ServiceImpl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.TheaterDto;
import com.main.BookMovieShow.Service.TheaterService;

@Service
public class TheaterServiceImpl implements TheaterService{

	@Override
	public List<TheaterDto> getAllTheaters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieDto> getMoviesInTheater(Long theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TheaterDto> getTheatersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TheaterDto getTheaterById(Long theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

}

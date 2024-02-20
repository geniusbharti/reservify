package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.TheaterDto;

public interface TheaterService {

	List<TheaterDto> getAllTheaters();

	List<MovieDto> getMoviesInTheater(Long theaterId);

	List<TheaterDto> getTheatersByCity(String city);

	TheaterDto getTheaterById(Long theaterId);

	


}

package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Dto.ShowDto;
import com.main.BookMovieShow.Entity.Screen;
import com.main.BookMovieShow.Entity.Seat;

public interface ShowService {

	ShowDto getShowById(Long showId);

	List<ShowDto> getAllShows();

//	Screen getScreenForShow(Long showId);
	
	List<SeatDto> getAvailableSeatsForShow(Long showId);

}

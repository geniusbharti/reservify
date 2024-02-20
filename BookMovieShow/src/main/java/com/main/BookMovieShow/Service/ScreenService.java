package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.SeatDto;

public interface ScreenService {

	ScreenDto getScreenById(Long screenId);

	List<ScreenDto> getAllScreens();

	List<SeatDto> getAvailableSeatsForShowOnScreen(Long screenId, Long showId);

	void bookSeatsForShowOnScreen(Long screenId, Long showId, List<Long> seatIds);

}

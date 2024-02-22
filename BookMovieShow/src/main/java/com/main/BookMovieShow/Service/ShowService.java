package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.SeatDto;

public interface ShowService {

	List<SeatDto> getAvailableSeatsForShow(Long showId);

}

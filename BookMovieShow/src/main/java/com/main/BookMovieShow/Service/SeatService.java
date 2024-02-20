package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.SeatDto;

public interface SeatService {

	SeatDto getSeatById(Long seatId);

	List<SeatDto> getAllSeats();

}

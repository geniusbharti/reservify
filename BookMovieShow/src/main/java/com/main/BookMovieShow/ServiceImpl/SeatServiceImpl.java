package com.main.BookMovieShow.ServiceImpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Repository.SeatRepository;
import com.main.BookMovieShow.Service.SeatService;
import com.main.BookMovieShow.exception.SeatNotFoundException;

@Service
public class SeatServiceImpl implements SeatService{

	@Autowired
	SeatRepository seatRepository;
	
	@Override
	public SeatDto getSeatById(Long seatId) {
		Optional<Seat> seat = seatRepository.findById(seatId);
		if(seat.isPresent()) {
			Seat seatEntity = seat.get();
			SeatDto seatDto = Seat.prepareSeatDTO(seatEntity);
			return seatDto;
		}
		
		else throw new SeatNotFoundException(seatId);
	}

}

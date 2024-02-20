package com.main.BookMovieShow.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Service.ScreenService;

@Service
public class ScreenServiceImpl implements ScreenService{

	@Override
	public ScreenDto getScreenById(Long screenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScreenDto> getAllScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeatDto> getAvailableSeatsForShowOnScreen(Long screenId, Long showId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bookSeatsForShowOnScreen(Long screenId, Long showId, List<Long> seatIds) {
		// TODO Auto-generated method stub
		
	}

}

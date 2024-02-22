package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.ScreenDto;

public interface ScreenService {

	ScreenDto getScreenById(Long screenId);

	List<ScreenDto> getAllScreens();

	
}

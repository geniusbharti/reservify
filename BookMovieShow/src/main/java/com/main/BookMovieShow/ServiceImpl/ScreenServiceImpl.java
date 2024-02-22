package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Entity.Screen;
import com.main.BookMovieShow.Repository.ScreenRepository;
import com.main.BookMovieShow.Service.ScreenService;

@Service
public class ScreenServiceImpl implements ScreenService{
	
	@Autowired
	ScreenRepository screenRepository;
	
	@Override
	public ScreenDto getScreenById(Long screenId) {
		    Optional<Screen> screen = screenRepository.findById(screenId);
			Screen screenEntity = screen.get();
			ScreenDto screenDto = Screen.prepareScreenDTO(screenEntity);
			return screenDto;
	}

	@Override
	public List<ScreenDto> getAllScreens() {
		List<Screen> screen = screenRepository.findAll();
        return screen.stream().map(Screen::prepareScreenDTO).collect(Collectors.toList());
	}

}

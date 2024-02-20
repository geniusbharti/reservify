package com.main.BookMovieShow.Service;

import java.util.List;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.ShowDto;

public interface ShowService {

	ShowDto getShowById(Long showId);

	List<ShowDto> getAllShows();

	ScreenDto getScreenForShow(Long showId);

}

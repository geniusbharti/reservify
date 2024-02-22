package com.main.BookMovieShow.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Entity.Seat;
import com.main.BookMovieShow.Entity.Show;
import com.main.BookMovieShow.Repository.SeatRepository;
import com.main.BookMovieShow.Repository.ShowRepository;
import com.main.BookMovieShow.Service.ShowService;
import com.main.BookMovieShow.exception.ShowNotFoundException;
import com.main.BookMovieShow.Enum.*;

@Service
public class ShowServiceImpl implements ShowService{
	 @Autowired
	 ShowRepository showRepository;
	 @Autowired
	 SeatRepository seatRepository;

	//---------------  SERVICE LOGIC TO GET AVAILABLE SEATS FOR A SHOW -----------------
    public List<SeatDto> getAvailableSeatsForShow(Long showId) {
    	Optional<Show> show = showRepository.findById(showId);
    	
    	if(show.isPresent()) {
    		List<Seat> seats = seatRepository.findAvailableSeatsForScreen(show.get().getScreen().getScreenId(), ReserveStatusSeat.AVAILABLE);
	    	
	        // Handle the case when the show with the given ID is not found
	    	return seats.stream().map(Seat::prepareSeatDTO).collect(Collectors.toList());
    	}
  	        
    	else throw new ShowNotFoundException(showId);
    }

}

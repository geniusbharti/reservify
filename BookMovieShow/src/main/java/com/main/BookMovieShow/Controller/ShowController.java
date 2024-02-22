package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.SeatDto; 
import com.main.BookMovieShow.Service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;
    
    
    // This API is responsible for providing available seats with a screen for a selectedShow[aka selected showId]
    @GetMapping("/{showId}/screen")
    public ResponseEntity<List<SeatDto>> getScreenForShow(@PathVariable Long showId){
        List<SeatDto> seats = showService.getAvailableSeatsForShow(showId);
        return ResponseEntity.ok(seats);
    }

    // Other CRUD operations and endpoints can be added as needed...
}


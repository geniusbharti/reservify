package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.TheaterDto;
import com.main.BookMovieShow.Service.TheaterService;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    // Get theaters by city
    @GetMapping("/city/{city}")
    public ResponseEntity<List<TheaterDto>> getTheatersByCity(@PathVariable String city) {
        List<TheaterDto> theaterDtos = theaterService.getTheatersByCity(city);
        return ResponseEntity.ok(theaterDtos);
    }
    
    // Get theater by id
    @GetMapping("/{theaterId}")
    public ResponseEntity<TheaterDto> getTheaterById(@PathVariable Long theaterId) {
        TheaterDto theaterDto = theaterService.getTheaterById(theaterId);
        return ResponseEntity.ok(theaterDto);
    }
    
    // Get all theaters 
    @GetMapping
    public ResponseEntity<List<TheaterDto>> getAllTheaters() {
        List<TheaterDto> theaterDtos = theaterService.getAllTheaters();
        return ResponseEntity.ok(theaterDtos);
    }
    
     // Get movies in a specific theater
    @GetMapping("/{theaterId}/movies")
    public ResponseEntity<List<MovieDto>> getMoviesInTheater(@PathVariable Long theaterId) {
        List<MovieDto> movieDtos = theaterService.getMoviesInTheater(theaterId);
        return ResponseEntity.ok(movieDtos);
    }
    
    // Other CRUD operations and endpoints as needed in future can be added...
}


package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.MovieDto;
import com.main.BookMovieShow.Dto.ShowDto;
import com.main.BookMovieShow.Service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long movieId) {
        MovieDto movieDto = movieService.getMovieById(movieId);
        return ResponseEntity.ok(movieDto);
    }
    
    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies() {
        List<MovieDto> movieDtos = movieService.getAllMovies();
        return ResponseEntity.ok(movieDtos);
    }
    
    // Get shows for a specific movie
    @GetMapping("/{movieId}/shows")
    public ResponseEntity<List<ShowDto>> getShowsForMovie(@PathVariable Long movieId) {
        List<ShowDto> showDtos = movieService.getShowsForMovie(movieId);
        return ResponseEntity.ok(showDtos);
    }

    // Other CRUD operations and endpoints as needed
}

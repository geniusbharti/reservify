package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.ShowDto;
import com.main.BookMovieShow.Service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/{showId}")
    public ResponseEntity<ShowDto> getShowById(@PathVariable Long showId) {
        ShowDto showDto = showService.getShowById(showId);
        return ResponseEntity.ok(showDto);
    }

    @GetMapping
    public ResponseEntity<List<ShowDto>> getAllShows() {
        List<ShowDto> showDtos = showService.getAllShows();
        return ResponseEntity.ok(showDtos);
    }
    
 // Get the screen for a specific show
    @GetMapping("/{showId}/screen")
    public ResponseEntity<ScreenDto> getScreenForShow(@PathVariable Long showId) {
        ScreenDto screenDto = showService.getScreenForShow(showId);
        return ResponseEntity.ok(screenDto);
    }

    // Other CRUD operations and endpoints as needed
}


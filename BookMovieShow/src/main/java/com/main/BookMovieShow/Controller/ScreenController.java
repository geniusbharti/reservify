package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Service.ScreenService;

@RestController
@RequestMapping("/api/shows/{showId}/screens")
public class ScreenController {

    @Autowired
    private ScreenService screenService;
    
    
    //To get all seats  for a screen [BOOKED + AVAILABLE]
    @GetMapping("/{screenId}")
    public ResponseEntity<ScreenDto> getScreenById(@PathVariable Long screenId) {
        ScreenDto screenDto = screenService.getScreenById(screenId);
        return ResponseEntity.ok(screenDto);
    }
    
    //To get all screens for a show
    @GetMapping
    public ResponseEntity<List<ScreenDto>> getAllScreens() {
        List<ScreenDto> screenDtos = screenService.getAllScreens();
        return ResponseEntity.ok(screenDtos);
    }
    


    // Other CRUD operations and endpoints as needed
}


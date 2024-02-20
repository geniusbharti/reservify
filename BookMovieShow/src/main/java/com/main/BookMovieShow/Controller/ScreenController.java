package com.main.BookMovieShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.ScreenDto;
import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Service.BookService;
import com.main.BookMovieShow.Service.ScreenService;

@RestController
@RequestMapping("/api/shows/{showId}/screens")
public class ScreenController {

    @Autowired
    private ScreenService screenService;
    
    @Autowired
    private BookService bookService;

    @GetMapping("/{screenId}")
    public ResponseEntity<ScreenDto> getScreenById(@PathVariable Long screenId) {
        ScreenDto screenDto = screenService.getScreenById(screenId);
        return ResponseEntity.ok(screenDto);
    }

//    @GetMapping
//    public ResponseEntity<List<ScreenDto>> getAllScreens() {
//        List<ScreenDto> screenDtos = screenService.getAllScreens();
//        return ResponseEntity.ok(screenDtos);
//    }
    
 // Get available seats for a specific show on a screen with seat statuses
    @GetMapping("/{screenId}/seats/available")
    public ResponseEntity<List<SeatDto>> getAvailableSeatsForShowOnScreen(
            @PathVariable Long screenId,
            @PathVariable Long showId) {
        List<SeatDto> availableSeatDtos = screenService.getAvailableSeatsForShowOnScreen(screenId, showId);
        return ResponseEntity.ok(availableSeatDtos);
    }

    // Book seats for a show on a screen
    @PostMapping("/{screenId}/seats/book")
    public ResponseEntity<String> bookSeatsForShowOnScreen(
            @PathVariable Long screenId,
            @PathVariable Long showId,
            @RequestBody List<Long> seatIds) {
        bookService.bookSeatsForShowOnScreen(screenId, showId, seatIds);
        return ResponseEntity.ok("Seats booked successfully!");
    }

    // Other CRUD operations and endpoints as needed
}


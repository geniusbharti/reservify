package com.main.BookMovieShow.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.BookMovieShow.Dto.SeatDto;
import com.main.BookMovieShow.Service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/{seatId}")
    public ResponseEntity<SeatDto> getSeatById(@PathVariable Long seatId) {
        SeatDto seatDto = seatService.getSeatById(seatId);
        return ResponseEntity.ok(seatDto);
    }

    // Other CRUD operations and endpoints as needed
}


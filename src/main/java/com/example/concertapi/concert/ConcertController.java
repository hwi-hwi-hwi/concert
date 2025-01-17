package com.example.concertapi.concert;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/concerts")
public class ConcertController {
    private final ConcertService concertService;

    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

    @GetMapping
    public List<ConcertDTO> getAllConcerts() {
        return concertService.getAllConcerts();
    }
}
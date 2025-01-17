package com.example.concerts.concert;

import com.example.concerts.entity.Venue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConcertService {
    private final ConcertRepository concertRepository;

    public ConcertService(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    // Concert 엔티티를 DTO로 변환하는 메서드
    public List<ConcertDTO> getAllConcerts() {
        List<Concert> concerts = concertRepository.findAll();
        return concerts.stream()
                .map(concert -> {
                    ConcertDTO dto = new ConcertDTO();
                    dto.setId(concert.getId());
                    dto.setTitle(concert.getTitle());
                    dto.setPosterUrl(concert.getPosterUrl());
                    dto.setReservationDate(concert.getReservationDate());

                    // Venue 정보가 있다면, 해당 정보를 DTO에 세팅
                    Venue venue = concert.getVenue();
                    if (venue != null) {
                        dto.setVenueName(venue.getName());  // venue 이름만 포함
                        // 필요한 다른 venue 정보가 있다면 추가로 설정할 수 있습니다.
                    }
                    return dto;
                })
                .collect(Collectors.toList());
    }
}

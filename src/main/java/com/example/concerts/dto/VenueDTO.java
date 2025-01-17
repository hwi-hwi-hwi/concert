package com.example.concerts.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VenueDTO {
    private Long id;
    private String name;
    private int capacity;
    private double latitude;
    private double longitude;
    private String additionalInfo; // 공연 시설의 추가 정보
}

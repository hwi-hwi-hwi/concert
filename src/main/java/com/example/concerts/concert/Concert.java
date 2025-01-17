package com.example.concerts.concert;

import com.example.concerts.entity.BaseEntity;
import com.example.concerts.entity.Venue;
import com.google.firebase.database.IgnoreExtraProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@IgnoreExtraProperties
public class Concert extends BaseEntity {

    private String title;
    private String posterUrl;
    private LocalDateTime reservationDate;
    private Venue venue;  // Firebase에서 Venue를 객체로 저장

    // 기본 생성자
    public Concert() {}

    public Concert(String title, String posterUrl, LocalDateTime reservationDate, Venue venue) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.reservationDate = reservationDate;
        this.venue = venue;
    }
}

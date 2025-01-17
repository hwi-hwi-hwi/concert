package com.example.concertapi.entity;

import com.google.firebase.database.IgnoreExtraProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@IgnoreExtraProperties // Firebase에서 객체를 매핑할 때 추가적인 필드를 무시
public class Venue {
    private String name;
    private int capacity;
    private double latitude;
    private double longitude;
    private String additionalInfo;

    // 기본 생성자
    public Venue() {}

    public Venue(String name, int capacity, double latitude, double longitude, String additionalInfo) {
        this.name = name;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.additionalInfo = additionalInfo;
    }
}

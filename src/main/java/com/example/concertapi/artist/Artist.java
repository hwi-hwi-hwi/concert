package com.example.concertapi.artist;

import com.example.concertapi.entity.BaseEntity;
import com.google.firebase.database.IgnoreExtraProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@IgnoreExtraProperties
public class Artist extends BaseEntity {

    private String name;
    private String thumbnailUrl;
    private String additionalInfo;

    // 기본 생성자
    public Artist() {}

    public Artist(String name, String thumbnailUrl, String additionalInfo) {
        this.name = name;
        this.thumbnailUrl = thumbnailUrl;
        this.additionalInfo = additionalInfo;
    }
}

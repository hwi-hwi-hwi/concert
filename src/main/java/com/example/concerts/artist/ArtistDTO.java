package com.example.concerts.artist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArtistDTO {
    private Long id;
    private String name;
    private String thumbnailUrl;
    private String additionalInfo; // 아티스트의 추가 정보
}

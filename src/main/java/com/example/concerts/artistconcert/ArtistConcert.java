package com.example.concerts.artistconcert;

import com.example.concerts.artist.Artist;
import com.example.concerts.entity.BaseEntity;
import com.example.concerts.concert.Concert;
import com.google.firebase.database.IgnoreExtraProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@IgnoreExtraProperties
public class ArtistConcert extends BaseEntity {

    private Artist artist;
    private Concert concert;

    // 기본 생성자
    public ArtistConcert() {}

    public ArtistConcert(Artist artist, Concert concert) {
        this.artist = artist;
        this.concert = concert;
    }
}
// 박서현
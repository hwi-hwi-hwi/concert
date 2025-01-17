package com.example.concertapi.artistconcert;

import com.example.concertapi.artist.Artist;
import com.example.concertapi.entity.BaseEntity;
import com.example.concertapi.concert.Concert;
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
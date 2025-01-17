package com.example.concertapi.service;

import com.example.concertapi.entity.Venue;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import org.springframework.stereotype.Service;

@Service
public class VenueService {
    private DatabaseReference database;

    public VenueService() {
        this.database = FirebaseDatabase.getInstance().getReference();
    }

    // Venue 추가
    public void addVenue(Venue venue) {
        String venueId = database.push().getKey();  // Firebase에서 자동으로 ID를 생성
        database.child("venues").child(venueId).setValue(venue);
    }

    // Venue 조회
    public void getVenue(String venueId, ValueEventListener listener) {
        database.child("venues").child(venueId).addListenerForSingleValueEvent(listener);
    }

    // Venue 수정
    public void updateVenue(String venueId, Venue venue) {
        database.child("venues").child(venueId).setValue(venue);
    }

    // Venue 삭제
    public void deleteVenue(String venueId) {
        database.child("venues").child(venueId).removeValue();
    }
}

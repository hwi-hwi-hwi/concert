package com.example.concerts.entity;

import com.google.firebase.database.IgnoreExtraProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@IgnoreExtraProperties // Firebase에서 객체를 매핑할 때 추가적인 필드를 무시
public abstract class BaseEntity {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 기본 생성자
    public BaseEntity() {}

    public BaseEntity(Long id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // id를 public으로 접근할 수 있도록 getId() 메서드 추가
    public Long getId() {
        return id;
    }
}

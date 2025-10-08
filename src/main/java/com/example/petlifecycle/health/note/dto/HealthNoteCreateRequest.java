package com.example.petlifecycle.health.note.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class HealthNoteCreateRequest {
    private LocalDate recordDate;
    private String mood;
    private String poop;
    private String pee;
    private String symptoms;
}

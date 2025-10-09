package com.example.petlifecycle.cycle.dto;

import com.example.petlifecycle.cycle.domain.PetCycle;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PetCycleResponse {
    private Long id;
    private Long petId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String memo;

    private PetCycleResponse(Long id, Long petId, LocalDate startDate, LocalDate endDate, String memo) {
        this.id = id;
        this.petId = petId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.memo = memo;
    }

    public static PetCycleResponse from(PetCycle petCycle) {
        return new PetCycleResponse(
                petCycle.getId(),
                petCycle.getPetId(),
                petCycle.getStartDate(),
                petCycle.getEndDate(),
                petCycle.getMemo()
        );
    }
}

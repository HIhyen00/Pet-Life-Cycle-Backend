package com.example.petlifecycle.mission.dto;

import com.example.petlifecycle.mission.domain.MissionCompletion;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MissionCompletionResponse {
    private Long completionId;
    private Long missionId;
    private String missionName;
    private LocalDate completedDate;

    private MissionCompletionResponse(Long completionId, Long missionId, String missionName, LocalDate completedDate) {
        this.completionId = completionId;
        this.missionId = missionId;
        this.missionName = missionName;
        this.completedDate = completedDate;
    }

    public static MissionCompletionResponse from(MissionCompletion missionCompletion) {
        return new MissionCompletionResponse(
                missionCompletion.getId(),
                missionCompletion.getDailyMission().getId(),
                missionCompletion.getDailyMission().getName(),
                missionCompletion.getCompletedDate()
        );
    }
}

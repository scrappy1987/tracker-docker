package com.qa.tracker.business.dto;

import java.util.ArrayList;
import java.util.List;

public class TrainerDto {
	
    private Integer trainerId;
    private String trainerName;
    private List<SkillDto> skills= new ArrayList<>();

    public TrainerDto(Integer trainerId, String trainerName, List<SkillDto> skills) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.skills = skills;
    }

    public TrainerDto() {
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public List<SkillDto> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDto> skills) {
        this.skills = skills;
    }
}

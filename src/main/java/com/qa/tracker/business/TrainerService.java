package com.qa.tracker.business;

import java.util.List;

import com.qa.tracker.business.dto.TrainerDto;

public interface TrainerService {
    TrainerDto getTrainerById(Integer trainerId);
    void saveTrainer(TrainerDto trainerDto);
    List<TrainerDto> getAllTrainers();
}

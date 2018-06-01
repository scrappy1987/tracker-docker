package com.qa.tracker.service;

import java.util.List;

import com.qa.tracker.dto.TrainerDto;

public interface TrainerService {
    TrainerDto getTrainerById(Integer trainerId);
    void saveTrainer(TrainerDto trainerDto);
    List<TrainerDto> getAllTrainers();
}

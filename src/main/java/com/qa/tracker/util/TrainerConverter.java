package com.qa.tracker.util;

import java.util.stream.Collectors;

import com.qa.tracker.business.dto.TrainerDto;
import com.qa.tracker.persistence.domain.Trainer;

public class TrainerConverter {
	
	public static Trainer dtoToEntity(TrainerDto trainerDto) {
		Trainer trainer = new Trainer(trainerDto.getTrainerName(), null);
		trainer.setTrainerId(trainerDto.getTrainerId());
		trainer.setSkills(trainerDto.getSkills().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return trainer;
	}

	public static TrainerDto entityToDto(Trainer trainer) {
		TrainerDto trainerDto = new TrainerDto(trainer.getTrainerId(), trainer.getTrainerName(), null);
		trainerDto.setSkills(trainer.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return trainerDto;
	}
}

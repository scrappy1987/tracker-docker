package com.qa.tracker.service.impl;

import com.qa.tracker.converter.TrainerConverter;
import com.qa.tracker.dto.TrainerDto;
import com.qa.tracker.repository.TrainerRepository;
import com.qa.tracker.service.TrainerService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceimpl implements TrainerService {
	
	@Autowired
	TrainerRepository trainerRepository;

	@Override
	public TrainerDto getTrainerById(Integer trainerId) {
		return TrainerConverter.entityToDto(trainerRepository.getOne(trainerId));
	}

	@Override
	public void saveTrainer(TrainerDto trainerDto) {
		trainerRepository.save(TrainerConverter.dtoToEntity(trainerDto));
	}

	@Override
	public List<TrainerDto> getAllTrainers() {
		return trainerRepository.findAll().stream().map(TrainerConverter::entityToDto).collect(Collectors.toList());
	}
}

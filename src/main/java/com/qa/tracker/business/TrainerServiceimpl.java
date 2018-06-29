package com.qa.tracker.business;

import com.qa.tracker.business.dto.TrainerDto;
import com.qa.tracker.persistence.TrainerRepository;
import com.qa.tracker.util.TrainerConverter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceimpl implements TrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;

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

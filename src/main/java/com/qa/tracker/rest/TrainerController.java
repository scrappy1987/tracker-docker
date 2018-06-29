package com.qa.tracker.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.tracker.business.TrainerService;
import com.qa.tracker.business.dto.TrainerDto;
import com.qa.tracker.constants.Constants;

@RequestMapping(Constants.TRAINER)
@RestController
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;

	@RequestMapping(Constants.GET_TRAINER_BY_ID)
	public TrainerDto getTrainerById(@PathVariable Integer trainerId) {
		return trainerService.getTrainerById(trainerId);
	}
	
	@RequestMapping(Constants.GET_ALL_TRAINERS)
	public List<TrainerDto> getAllTrainers() {
		return trainerService.getAllTrainers();
	}
	
	@RequestMapping(value= Constants.SAVE_TRAINER, method= RequestMethod.POST)
	public void saveTrainer(@RequestBody TrainerDto trainerDto) {
		trainerService.saveTrainer(trainerDto);
	}
}

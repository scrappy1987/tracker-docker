package com.qa.tracker;

import com.qa.tracker.entity.Skill;
import com.qa.tracker.entity.Trainer;
import com.qa.tracker.repository.TrainerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.util.Arrays;

@SpringBootApplication
public class App {
	
	@Autowired
	TrainerRepository trainerRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Trainer trainer= new Trainer("John Gordon", null);
		trainer.setSkills(Arrays.asList(new Skill("JavaEE"), new Skill("DB")));
		trainer= trainerRepository.save(trainer);
	}
}

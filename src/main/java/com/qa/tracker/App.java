package com.qa.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.qa.tracker.persistence.TrainerRepository;
import com.qa.tracker.persistence.domain.Skill;
import com.qa.tracker.persistence.domain.Trainer;
import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class App {
	
	@Autowired
	private TrainerRepository trainerRepository;

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

package com.qa.tracker.persistence.domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Trainer{
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer trainerId;
    @Column
    private String trainerName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Skill> skills= new LinkedList<>();

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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Trainer() {
    }

    public Trainer(String trainerName, List<Skill> skills) {
        this.trainerName = trainerName;
        this.skills = skills;
    }
}

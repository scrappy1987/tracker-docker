package com.qa.tracker.persistence.domain;

import javax.persistence.*;

@Entity
public class Skill {
    
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer skillId;
    @Column
    private String skillName;
    @ManyToOne
    private Trainer trainer;

    public Skill(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Skill() {
    }

    public Skill(String skillName, Trainer trainer) {
        this.skillName = skillName;
        this.trainer = trainer;
    }
}

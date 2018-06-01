package com.qa.tracker.repository;

import com.qa.tracker.entity.Skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}

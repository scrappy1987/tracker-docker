package com.qa.tracker.repository;

import com.qa.tracker.entity.Trainer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
}

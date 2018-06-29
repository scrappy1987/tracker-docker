package com.qa.tracker.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.tracker.persistence.domain.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
}

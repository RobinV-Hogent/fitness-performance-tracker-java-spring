package com.vermeir.fitness_performance_tracker.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

	@Override
	default Exercise getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

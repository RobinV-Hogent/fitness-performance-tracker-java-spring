package com.vermeir.fitness_performance_tracker.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;
import com.vermeir.fitness_performance_tracker.api.models.Workout;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
	
	// Indien jezelf extra queries toevoegt
	// @Query("SELECT w FROM Workout w WHERE w.workoutName LIKE %:name%")
	// List<Workout> findByCustomName(String name);
	
}

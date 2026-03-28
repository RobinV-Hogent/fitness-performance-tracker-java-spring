package com.vermeir.fitness_performance_tracker.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

}

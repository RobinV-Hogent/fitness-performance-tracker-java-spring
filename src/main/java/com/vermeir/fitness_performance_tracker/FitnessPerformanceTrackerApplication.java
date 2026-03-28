package com.vermeir.fitness_performance_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;
import com.vermeir.fitness_performance_tracker.api.repositories.ExerciseRepository;
import com.vermeir.fitness_performance_tracker.domain.enums.Muscle;

@SpringBootApplication
public class FitnessPerformanceTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessPerformanceTrackerApplication.class, args);
	}
	
}

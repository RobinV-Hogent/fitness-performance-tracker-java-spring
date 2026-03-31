package com.vermeir.fitness_performance_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;
import com.vermeir.fitness_performance_tracker.api.repositories.ExerciseRepository;
import com.vermeir.fitness_performance_tracker.domain.enums.Muscle;
import com.vermeir.fitness_performance_tracker.domain.state.ApplicationContext;

@SpringBootApplication
public class FitnessPerformanceTrackerApplication {
	
	public static void main(String[] args) {
	 	var appContext = SpringApplication.run(FitnessPerformanceTrackerApplication.class, args);
		
		ApplicationContext context = appContext.getBean(ApplicationContext.class);
        context.handle();
	}
	
}

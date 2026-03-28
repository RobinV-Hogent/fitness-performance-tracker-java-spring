package com.vermeir.fitness_performance_tracker.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeir.fitness_performance_tracker.api.models.Exercise;
import com.vermeir.fitness_performance_tracker.api.repositories.ExerciseRepository;
import com.vermeir.fitness_performance_tracker.domain.enums.Muscle;

@RestController
public class ExerciseController {

	private ExerciseRepository exerciseRepo;
	
	@Autowired
	public ExerciseController(ExerciseRepository exerciseRepo) {
		this.exerciseRepo = exerciseRepo;
	}
	
	
	@GetMapping("/hello")
	public String CreateExercise() {
		Exercise ex = new Exercise();
		ex.setName("Shoulder Press");
		ex.setDescription("Works the side and front delts");
		ex.setTargetedMuscle(Muscle.SHOULDER);
		
		this.exerciseRepo.save(ex);
		
		return "Created";
	}
	
}

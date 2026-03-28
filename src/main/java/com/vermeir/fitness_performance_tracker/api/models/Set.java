package com.vermeir.fitness_performance_tracker.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sets")
public class Set {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private int reps;
	
	@OneToOne
	@JoinColumn(name="exercise_id")
	private Exercise exercise;
	
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
//	public Exercise getExercise() {
//		return exercise;
//	}
//	public void setExercise(Exercise exercise) {
//		this.exercise = exercise;
//	}
	
	
}

package com.vermeir.fitness_performance_tracker.api.models;

import java.util.List;

import com.vermeir.fitness_performance_tracker.domain.enums.Muscle;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// exercise table
@Entity
@Table(name = "exercises")
public class Exercise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Muscle targetedMuscle;
	private String description;
	
	@OneToMany(mappedBy = "exercise")
	private List<Set> sets;
	
	// Standard Getters/Setters
    public List<Set> getSets() { return sets; }
    public void setSets(List<Set> sets) { this.sets = sets; }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Muscle getTargetedMuscle() {
		return targetedMuscle;
	}
	public void setTargetedMuscle(Muscle targetedMuscle) {
		this.targetedMuscle = targetedMuscle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

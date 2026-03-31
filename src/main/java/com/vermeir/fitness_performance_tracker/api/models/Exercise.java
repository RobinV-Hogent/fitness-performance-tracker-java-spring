package com.vermeir.fitness_performance_tracker.api.models;

import java.util.List;

import com.vermeir.fitness_performance_tracker.domain.enums.Muscle;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

// exercise table
@Entity
@Table(name = "exercises")
public class Exercise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@OneToMany(mappedBy = "exercise")
	private List<Set> sets;

	@Enumerated(EnumType.STRING)
	private Muscle targetedMuscle;

	private String name;

	private String description;

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

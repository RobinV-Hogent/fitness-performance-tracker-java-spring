package com.vermeir.fitness_performance_tracker.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeir.fitness_performance_tracker.api.models.User;
import com.vermeir.fitness_performance_tracker.api.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;
	
	@Autowired
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public void createNewUser(String name) {
		// TODO: Checken ofdat er al een user is met dezelfde naam
		
		this.userRepo.save(new User(name));
	}
	
	public List<User> getUsers() {
		return this.userRepo.findAll();
	}
	
}

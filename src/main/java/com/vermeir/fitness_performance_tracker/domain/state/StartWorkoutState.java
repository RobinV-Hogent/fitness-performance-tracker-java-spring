package com.vermeir.fitness_performance_tracker.domain.state;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vermeir.fitness_performance_tracker.api.models.User;
import com.vermeir.fitness_performance_tracker.api.repositories.UserRepository;
import com.vermeir.fitness_performance_tracker.api.services.UserService;

@Component
public class StartWorkoutState implements ApplicationState {

	private UserService userService;
	
	@Autowired
	public StartWorkoutState(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void handle(ApplicationContext context) {
		System.out.println("Wie gaat de workout uitvoeren");
		
		List<User> users = this.userService.getUsers();
		
		for (User user : users) {
			System.out.println(String.format("(%s) %s", user.getId(), user.getName()));
		}
	} 
}

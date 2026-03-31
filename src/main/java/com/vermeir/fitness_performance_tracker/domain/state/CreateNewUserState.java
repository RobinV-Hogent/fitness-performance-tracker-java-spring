package com.vermeir.fitness_performance_tracker.domain.state;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vermeir.fitness_performance_tracker.api.services.UserService;

@Component
public class CreateNewUserState implements ApplicationState {

	private UserService userService;
	
	@Autowired
	public CreateNewUserState(UserService userService, IntroductionState introductionState) {
		this.userService = userService;
	}

	@Override
	public void handle(ApplicationContext context) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welke naam wil je geven aan de nieuwe gebruiker?");
		String userName = scanner.next();
		
	
		this.userService.createNewUser(userName);
		
		context.setState(State.INTRO);
	}

}

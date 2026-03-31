package com.vermeir.fitness_performance_tracker.domain.state;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntroductionState implements ApplicationState {

	@Override
	public void handle(ApplicationContext context) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduction: Welcome make a choice between:");
		System.out.println("1. Create a new user");
		System.out.println("2. Start a new workout");

		int option = Integer.parseInt(scanner.next());
		System.out.println("Great option");
		switch (option) {
		case 1: {
			context.setState(State.USER);
			break;
		}
		case 2: {
			context.setState(State.START_WORKOUT);
			break;
		}
		default:
			context.setState(State.INTRO);
		}
	}

}

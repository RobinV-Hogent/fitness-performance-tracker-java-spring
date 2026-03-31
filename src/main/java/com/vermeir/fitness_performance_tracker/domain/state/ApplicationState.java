package com.vermeir.fitness_performance_tracker.domain.state;

public interface ApplicationState {
	void handle(ApplicationContext context);
}

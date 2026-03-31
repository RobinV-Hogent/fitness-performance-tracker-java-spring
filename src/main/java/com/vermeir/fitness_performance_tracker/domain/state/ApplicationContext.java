package com.vermeir.fitness_performance_tracker.domain.state;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContext {

	private ApplicationState state;
	
	private Map<State, ApplicationState> States = new HashMap<State, ApplicationState>();
	
	private IntroductionState introductionState;
	private CreateNewUserState createNewUserState;
	private StartWorkoutState startWorkoutState;
	
	@Autowired
	public ApplicationContext(
		IntroductionState introductionState,
		CreateNewUserState createNewUserState,
		StartWorkoutState startWorkoutState
	) {
		
		States.put(State.INTRO, introductionState);
		States.put(State.USER, createNewUserState);
		States.put(State.START_WORKOUT, startWorkoutState);
		
		this.setState(State.INTRO);
	}

	public void setState(State state) {
        this.state = this.States.get(state);
        this.handle();
    }

    public void handle() {
        state.handle(this);
    }

}

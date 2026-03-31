package com.vermeir.fitness_performance_tracker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class SimpleTestCases {

	int number;
	
	@BeforeEach
	void setUp() {
		this.number = -1;
	}
	
	@Test
	@DisplayName("Should return true if value is negative")
	void test() {
		// Arrange
		int multiplier = 1;
		
		// Act
		int result = this.number * multiplier;
		
		// Assert
		assertEquals(result < 0, true);
	}
	
}

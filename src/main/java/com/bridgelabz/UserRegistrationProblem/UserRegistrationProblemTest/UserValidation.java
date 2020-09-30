package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

public class UserValidation {

	public String AnalyseMood(String message) {
		if(message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
	
	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the User Validation Problem");
	}

	public boolean ValidateFirstName(String firstName) {
		return firstName.matches("([A-Z][a-z]{2,})");
	}

}
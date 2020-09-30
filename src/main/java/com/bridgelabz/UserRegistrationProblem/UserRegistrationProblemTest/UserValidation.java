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
	
	public boolean ValidateLastName(String lastName) {
		return lastName.matches("([A-Z][a-z]{2,})");
	}
	
	public boolean ValidateEmail(String email) {
		return email.matches("(^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$)");
	}

}
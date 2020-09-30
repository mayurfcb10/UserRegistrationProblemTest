package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest 
{

	UserValidation userValidation = new UserValidation();

	@Test
	public void PrintWelcomeMessage() {
		userValidation.PrintWelcomeMessage();
	}

}
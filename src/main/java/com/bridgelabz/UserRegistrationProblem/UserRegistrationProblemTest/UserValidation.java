package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;


@FunctionalInterface
interface checkIfValidate {
    public boolean checkIfValidate(String input)throws UserValidationException;
}

public class UserValidation {

	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the User Validation Problem");
	}

	public void IsEmptyorNullString(String input) throws UserValidationException {
		try {
			if (input.length() == 0) {
				throw new UserValidationException( UserValidationException.ExceptionType.GIVEN_EMPTY, " Empty input not Allowed please Enter again");
			}
		}
		catch(NullPointerException e)
		{
			throw new UserValidationException( UserValidationException.ExceptionType.GIVEN_NULL, "Null not allowed please Enter again ");

		}
	}

	checkIfValidate validateFirstName = (String firstName)-> {
		IsEmptyorNullString(firstName);
		boolean  matcher = firstName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			return matcher;
		} 
		return matcher;
	};

	checkIfValidate validateLastName = (String lastName) -> {
		IsEmptyorNullString(lastName);
		boolean matcher = lastName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			return matcher;
		}
		return matcher;

	};

	checkIfValidate validateEmail = (String email) -> {
		IsEmptyorNullString(email);
		boolean matcher = email.matches( "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$");
		if(matcher == true) {
			return matcher;
		}
		else 
			return matcher;
	};

	checkIfValidate validatePhoneNumber = (String phoneNumber) -> {
		IsEmptyorNullString(phoneNumber);
		boolean matcher = phoneNumber.matches("(([0-9]{2})?)[ ][0-9]{10}");
		if(matcher) {
			System.out.println("Valid Mobile Number");
			return matcher;
		}
		return false;
		
	};

	checkIfValidate validatePassword = (String password) -> {
		IsEmptyorNullString(password);
		boolean matcher = password.matches("(^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*[@*&^%#-*+!]{1}).{8,}$");

		if(matcher) {
			System.out.println("Valid Password");
			return matcher;
		}
		return false;

	};
}
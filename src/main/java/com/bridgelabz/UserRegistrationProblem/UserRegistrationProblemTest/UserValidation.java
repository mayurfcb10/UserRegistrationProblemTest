package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

public class UserValidation {

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


	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the User Validation Problem");
	}


	public boolean ValidateFirstName(String firstName) throws UserValidationException {
		IsEmptyorNullString(firstName);
		boolean flag = true, matcher;
		if(flag == true) {
			matcher = firstName.matches("([A-Z][a-z]{2,})");
			System.out.println("Valid First Name");
			return matcher;
		} 
		else {
			throw new UserValidationException( UserValidationException.ExceptionType.INVALID_FIRST_NAME,"Given Invalid First Name");
		}

	}

	public boolean ValidateLastName(String lastName) throws UserValidationException {
		IsEmptyorNullString(lastName);
		boolean matcher = lastName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			System.out.println("Valid Last Name");
			return matcher;
		} else 
		{
			throw new UserValidationException( UserValidationException.ExceptionType.INVALID_LAST_NAME,"Given Invalid Last Name");
		}

	}

	public boolean ValidateEmail(String email) throws UserValidationException {
		IsEmptyorNullString(email);
		boolean matcher = email.matches( "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$");
		if(matcher == true) {
			System.out.println("Valid Email");
			return matcher;
		}
		else {
			throw new UserValidationException( UserValidationException.ExceptionType.INVALID_EMAIL,"Given Invalid Email");
		}
	}

	public boolean ValidatePhoneNumber(String phoneNumber) throws UserValidationException {
		IsEmptyorNullString(phoneNumber);
		boolean matcher = phoneNumber.matches("(([0-9]{2})?)[ ][0-9]{10}");
		if(matcher == true) {
			System.out.println("Valid Mobile Number");
			return matcher;
		}
		else {
			throw new UserValidationException(UserValidationException.ExceptionType.INVALID_PHONE_NUMBER,"Given Invalid PhoneNumber");
		}
	}


	public boolean ValidatePassword(String password) throws UserValidationException {
		IsEmptyorNullString(password);
		boolean matcher = password.matches("(^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*[@*&^%#-*+!]{1}).{8,}$");

		if(matcher == true) {
			System.out.println("Valid Password");
			return matcher;
		}
		else {
			throw new UserValidationException( UserValidationException.ExceptionType.INVALID_PASSWORD,"Given Invalid Password");
		}

	}
}
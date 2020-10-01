package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

public class UserValidationException extends Exception {
	enum ExceptionType
	{
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD, GIVEN_NULL, GIVEN_EMPTY ;
	}


	public static final Object INVALID_FIRST_NAME = null;
	public static final Object INVALID_LAST_NAME = null;
	public static final Object GIVEN_NULL = null;


	ExceptionType type;

	public UserValidationException(ExceptionType type, String string) {
		super(string);
		this.type = type;
	}

}



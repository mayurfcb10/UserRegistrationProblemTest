package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest.UserValidationException.ExceptionType;

public class UserValidationTest 
{

	UserValidation userValidation = new UserValidation();

	@Test
	public void PrintWelcomeMessage() {
		userValidation.PrintWelcomeMessage();
	}


	@Test
	public void given_FirstName_NULL_return_Null_Not_Allowed_Try_Again()throws UserValidationException { 
		boolean result;
		try {
			result = userValidation.ValidateFirstName(null);
		} catch(UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}

	@Test
	public void given_FirstName_Empty_return_EmptyName_not_Allowed() throws UserValidationException {
		boolean result ;
		try {
			result = userValidation.ValidateFirstName("");
		}catch(UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}

	@Test
	public void given_FirstName_Alphanumeric_return_false() throws UserValidationException {
		boolean result;
		try {
			result = userValidation.ValidateFirstName("Mar6sh");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.INVALID_FIRST_NAME , e.type );
		}
		
	}

	@Test
	public void given_LastName_CapitalLetter_return_true() throws UserValidationException {
		boolean result;
		try {
			result = userValidation.ValidateLastName("Shah");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.INVALID_LAST_NAME , e.type );
		}
	}
	
	@Test
	public void given_Email_when_given_Empty_return_EmptyInputNotAllowed() throws UserValidationException{
		boolean result;
		try {
			result = userValidation.ValidateEmail("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}
	
	@Test
	public void given_Email_when_given_Null_return_NullNotAllowed() throws UserValidationException{
		boolean result;
		try {
			result = userValidation.ValidateEmail(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}
	
	@Test
	public void given_Email_when_emailStartswithDot_return_InvalidEmail() throws UserValidationException {
		boolean result;
		try {
			result = userValidation.ValidateEmail(".abc@gmail.com");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type );
		}
		
	}
	
	@Test
	public void given_PhoneNumber_with_NullValue_return_NullNotAllowed() throws UserValidationException
	{
		boolean result;
		try {
			result = userValidation.ValidatePhoneNumber(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL, e.type );
		}
	}

	@Test
	public void given_PhoneNumber_with_EmptyValue_return_Empty() throws UserValidationException
	{
		boolean result;
		try {
			result = userValidation.ValidatePhoneNumber("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY, e.type );
		}
	}
	
	@Test
	public void given_PhoneNumber_with_Invalid_countryCode_return_INVALID() throws UserValidationException
	{
		boolean result ;
		try {
			result = userValidation.ValidatePhoneNumber("789 4928472842");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PHONE_NUMBER, e.type );
		}
	
	}
	
	@Test
	public void given_Strong_Password_when_given_NULL_return_NullNotAllowed() throws UserValidationException
	{
		boolean result ;
		try {
			result = userValidation.ValidatePassword(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL, e.type );
		}
	
	}
	
	@Test
	public void given_Strong_Password_when_given_Empty_return_EmptyInputNotAllowed() throws UserValidationException
	{
		boolean result ;
		try {
			result = userValidation.ValidatePassword("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY, e.type );
		}
	
		
	}
	
	@Test
	public void given_Strong_Password_when_given_Wrongpassword_return_InvalidPassword() throws UserValidationException
	{
		boolean result ;
		try {
			result = userValidation.ValidatePassword("cmdjbhsur8766&");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type );
		}
	}

}

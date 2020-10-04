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
		try {
			boolean result = userValidation.validateFirstName.checkIfValidate(null);
		} catch(UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}

	@Test
	public void given_FirstName_Empty_return_EmptyName_not_Allowed() throws UserValidationException {
		try {
			boolean result = userValidation.validateFirstName.checkIfValidate("");
		}catch(UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}

	@Test
	public void given_FirstName_Alphanumeric_return_false() throws UserValidationException {
		boolean result;
			result = userValidation.validateFirstName.checkIfValidate("Mar6sh");
			Assert.assertEquals( false, result );
	}

	@Test
	public void given_LastName_CapitalLetter_return_true() throws UserValidationException {
		boolean result = false;
			result = userValidation.validateLastName.checkIfValidate("Shah");
			Assert.assertEquals(true, result );
	}

	@Test
	public void given_Email_when_given_Empty_return_EmptyInputNotAllowed() throws UserValidationException{
		try {
			boolean result = userValidation.validateEmail.checkIfValidate("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}

	@Test
	public void given_Email_when_given_Null_return_NullNotAllowed() throws UserValidationException{
		try {
			boolean result = userValidation.validateEmail.checkIfValidate(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}

	@Test
	public void given_Email_when_emailStartswithDot_return_InvalidEmail() throws UserValidationException {
		boolean result = userValidation.validateEmail.checkIfValidate(".abc@gmail.com");
		Assert.assertEquals( false, result);
	}

	@Test
	public void given_PhoneNumber_with_NullValue_return_NullNotAllowed() throws UserValidationException
	{
		try {
			boolean result =  userValidation.validatePhoneNumber.checkIfValidate(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL, e.type );
		}
	}

	@Test
	public void given_PhoneNumber_with_EmptyValue_return_Empty() throws UserValidationException
	{
		try {
			boolean result =  userValidation.validatePhoneNumber.checkIfValidate("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY, e.type );
		}
	}

	@Test
	public void given_PhoneNumber_with_Invalid_countryCode_return_INVALID() throws UserValidationException
	{
		boolean result = userValidation.validatePhoneNumber.checkIfValidate("789 4928472842");
		Assert.assertEquals(false, result );

	}

	@Test
	public void given_Strong_Password_when_given_NULL_return_NullNotAllowed() throws UserValidationException
	{
		
		try {
			boolean result = userValidation.validatePassword.checkIfValidate(null);
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_NULL, e.type );
		}

	}

	@Test
	public void given_Strong_Password_when_given_Empty_return_EmptyInputNotAllowed() throws UserValidationException
	{
		try {
			boolean result = userValidation.validatePassword.checkIfValidate("");
		} catch (UserValidationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.GIVEN_EMPTY, e.type );
		}


	}

	@Test
	public void given_FirstName_CapitalLetter_return_true() throws UserValidationException
	{
		boolean result = userValidation.validateFirstName.checkIfValidate("Marsh");
		Assert.assertEquals( true,result );
	}

	@Test
	public void given_FirstName_withMixedAlphabets_return_false() throws UserValidationException
	{
		boolean result = userValidation.validateFirstName.checkIfValidate("maRsh");
		Assert.assertEquals( false, result );
	}

	
	@Test
	public void given_LastName_withMixedAlphabets_return_false() throws UserValidationException
	{
		boolean result = userValidation.validateLastName.checkIfValidate("DAves");
		Assert.assertEquals(false,result );
	}

	
	@Test
	public void given_Email_when_given_CountryDomain_return_true() throws UserValidationException
	{
		boolean result = userValidation.validateEmail.checkIfValidate("abc@abc.com.au");
		Assert.assertTrue( result );
	}

	@Test
	public void given_Email_when_emailStartswithDot_return_false() throws UserValidationException
	{
		boolean result = userValidation.validateEmail.checkIfValidate(".abc@gmail.com");
		Assert.assertFalse( result );
	}

	@Test
	public void given_Email_containsOptional_Special_Character_return_true() throws UserValidationException
	{
		boolean result = userValidation.validateEmail.checkIfValidate("abc@%*.com.com");
		Assert.assertEquals( false, result );
	}
	
	@Test
	public void given_PhoneNumber_with_valid_countryCode_return_true() throws UserValidationException
	{
		boolean result = userValidation.validatePhoneNumber.checkIfValidate("91 7972245761");
		Assert.assertTrue( result );
	}

	@Test
	public void given_PhoneNumber_with_No_countryCode_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePhoneNumber.checkIfValidate("7596859453");
		Assert.assertFalse( result );
	}
	@Test
	public void given_PhoneNumber_with_Invalid_countryCode_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePhoneNumber.checkIfValidate("091 7596859453");
		Assert.assertFalse( result );
	}
	
	@Test
	public void given_Strong_Password_when_given_correct_return_true() throws UserValidationException
	{
		boolean result = userValidation.validatePassword.checkIfValidate("zcsfkasHds98&");
		Assert.assertTrue( result);
	}

	@Test
	public void given_Strong_Password_when_given_incorrect_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePassword.checkIfValidate("zcsfkasds98&");
		Assert.assertFalse( result);
	}

	@Test
	public void given_Strong_Password_when_given_more_than_one_Specialcharacter_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePassword.checkIfValidate("zcsfkasds9&5%8&");
		Assert.assertEquals( result, false);
	}
	
	@Test
	public void given_Strong_Password_when_given_No_UpperCharacter_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePassword.checkIfValidate("zcsfkasds9&5");
		Assert.assertEquals( result, false);
	}
	

	@Test
	public void given_Strong_Password_when_given_Wrongpassword_return_InvalidPassword() throws UserValidationException
	{
		boolean result ;
			result = userValidation.validatePassword.checkIfValidate("cmdjbhsur8766&");
			Assert.assertEquals( false, result );
	}
	
	@Test
	public void given_Strong_Password_when_given_No_Digit_return_false() throws UserValidationException
	{
		boolean result = userValidation.validatePassword.checkIfValidate("zCsfkasds&");
		Assert.assertEquals( result, false);
	}
}

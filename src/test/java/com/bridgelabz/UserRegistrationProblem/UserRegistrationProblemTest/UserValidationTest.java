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

	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		String mood = userValidation.AnalyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		String mood = userValidation.AnalyseMood("This is a Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void given_FirstName_CapitalLetter_return_true()
	{
		boolean result = userValidation.ValidateFirstName("Marsh");
		Assert.assertTrue( result );
	}

	@Test
	public void given_FirstName_withMixedAlphabets_return_false()
	{
		boolean result = userValidation.ValidateFirstName("maRsh");
		Assert.assertFalse( result );
	}

	@Test
	public void given_FirstName_Alphanumeric_return_false()
	{
		boolean result = userValidation.ValidateFirstName("Mar6sh");
		Assert.assertFalse( result );
	}
	
	@Test
	public void given_LastName_CapitalLetter_return_true()
	{
		boolean result = userValidation.ValidateLastName("Shah");
		Assert.assertTrue( result );
	}

	@Test
	public void given_LastName_withMixedAlphabets_return_false()
	{
		boolean result = userValidation.ValidateLastName("DAves");
		Assert.assertFalse( result );
	}

	@Test
	public void given_LastName_Alphanumeric_return_false()
	{
		boolean result = userValidation.ValidateLastName("Mar6sh");
		Assert.assertEquals( result, false );
	}

	
}

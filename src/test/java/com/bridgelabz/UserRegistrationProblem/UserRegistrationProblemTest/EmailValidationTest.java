package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidationTest {

	private String emailValidate;
	private boolean expectedResult;
	private UserValidation userValidation;

	public EmailValidationTest(String emailValidate) {
		super();
		this.emailValidate = emailValidate;
	}

	@Before
	public void initialize() {
		userValidation = new UserValidation();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{ "abc@.com" },
			 								 { "abc@123gmail.a" },
			 								 { "abc123@.com" },
			 								 { "abc123@.com.com" },
			 								 { ".abc@abc.com" },
			 								 { "abc()*@gmail.com" },
			 								 { "abc@%*.com.com" },
			 								 { "abc..2002@.gmail.com" },
			 								 { "abc.@gmail.com"},
			 								 { "abc@abc@gmail.com"},
			 								 { "abc@gmail.com.1a"},
			 								 { "abc@gmail.com.aa.au"}});
	}
	
	@Test
	public void TestEmailValiation() {
		boolean result;
		try {
			result = userValidation.ValidateEmail(this.emailValidate);
		} catch (UserValidationException e) {
			System.out.println(e.type + " will give message  "+ e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type );
		}
		
		
	}



}

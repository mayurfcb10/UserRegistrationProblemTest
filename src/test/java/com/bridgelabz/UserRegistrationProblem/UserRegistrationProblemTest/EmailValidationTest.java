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
	private EmailValidation emailValidation;

	public EmailValidationTest(String emailValidate, boolean expectedResult) {
		super();
		this.emailValidate = emailValidate;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		emailValidation = new EmailValidation();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{ "abc@yahoo.com", true },
											 { "abc-100@yahoo.com", true },
											 { "abc.100@yahoo.com", true },
											 { "abc-100@abc.net", true },
											 { "abc.100@abc.com.au", true },
											 { "abc@1.com", true },
											 { "abc@gmail.com.com", true },
											 { "abc+100@gmail.com", true },
											 { "abc@.com", false },
											 { "abc@123gmail.a", false },
											 { "abc123@.com", false },
											 { "abc123@.com.com", false },
											 { ".abc@abc.com", false },
											 { "abc()*@gmail.com", false },
											 { "abc@%*.com.com", false },
											 { "abc..2002@.gmail.com", false },
											 { "abc.@gmail.com", false },
											 { "abc@abc@gmail.com", false },
											 { "abc@gmail.com.1a", false },
											 { "abc@gmail.com.aa.au", false }});
		
	}
	
	@Test
	public void TestEmailValiation() {
		System.out.println(emailValidate + " "+expectedResult);
		Assert.assertEquals(expectedResult, emailValidation.EmailValidate(emailValidate, expectedResult));
		
	}



}

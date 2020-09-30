package com.bridgelabz.UserRegistrationProblem.UserRegistrationProblemTest;

import java.util.ArrayList;

public class EmailValidation {
	public void ValidateEmail() {

		String matcher="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
		ArrayList<String> validate = new ArrayList<>();
		// valid email
		validate.add("abc@yahoo.com");
		validate.add("abc-100@yahoo.com");
		validate.add("abc.100@yahoo.com");
		validate.add("abc-100@abc.net");
		validate.add("abc.100@abc.com.au");
		validate.add("abc@1.com");
		validate.add("abc@gmail.com.com");
		validate.add("abc+100@gmail.com");
		// invalid email
		validate.add("abc-");
		validate.add("abc@.com");
		validate.add("abc@123gmail.a");
		validate.add("abc123@.com");
		validate.add("abc123@.com.com");
		validate.add(".abc@abc.com");
		validate.add("abc()*@gmail.com");
		validate.add("abc@%*.com.com");
		validate.add("abc..2002@.gmail.com");
		validate.add("abc.@gmail.com");
		validate.add("abc@abc@gmail.com");
		validate.add("abc@gmail.com.1a");
		validate.add("abc@gmail.com.aa.au");

		for(String validate1 : validate) {
			System.out.println(validate1+" "+(validate1.matches(matcher)));
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration Problem");
		EmailValidation register = new EmailValidation(); 
		register.ValidateEmail();

	}
}

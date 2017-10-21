package com.mihir.listapp.dtos;

import org.apache.commons.validator.routines.EmailValidator;

import com.mihir.listapp.regex.Regex;

/*
 * This class is responsible for representing User Entity into Database
 * 
 */

public class Users
{

	private String uname;
	private String pass;
	private String dob;
	private String email;
	private String firstName;
	private String lastName;

	public Users(String uname, String pass, String dob, String email, String firstName, String lastName)
	{
		super();
		this.uname = uname;
		this.pass = pass;
		this.dob = dob;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;

		validate();

	}

	private void validate()
	{
		boolean l_validateAll = false;

		if (validateNames() && validateNumbers() && validateEmail())
			l_validateAll = true;

	}

	public boolean validateEmail()
	{
		EmailValidator emailAddr = EmailValidator.getInstance();
		return emailAddr.isValid(email);

	}

	private boolean validateNames()
	{
		if (firstName.matches(Regex.LETTERS))
			return false;

		if (lastName.matches(Regex.LETTERS))
			return false;

		else
			return true;
	}

	private boolean validateNumbers()
	{
		return true;
	}

}

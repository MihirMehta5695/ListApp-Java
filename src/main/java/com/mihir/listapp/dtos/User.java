package com.mihir.listapp.dtos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.validator.routines.EmailValidator;

import com.mihir.listapp.regex.Regex;

/*
 * This class is responsible for representing User Entity into Database
 * 
 */

@Entity
@XmlRootElement
public class User
{
	@Id
	private String	uname;
	private String	pass;
	private String	dob;
	private String	email;
	private String	firstName;
	private String	lastName;

	public User()
	{
	}

	public User(String uname, String pass, String dob, String email, String firstName, String lastName)
	{
		super();
		this.uname = uname;
		this.pass = pass;
		this.dob = dob;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;

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

	public String getUname()
	{
		return uname;
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}

	public String getPass()
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob)
	{
		this.dob = dob;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return "Users [uname=" + uname + ", pass=" + pass + ", dob=" + dob + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}

}

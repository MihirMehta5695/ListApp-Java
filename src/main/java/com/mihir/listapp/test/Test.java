package com.mihir.listapp.test;

import com.mihir.listapp.dtos.User;
import com.mihir.listapp.resources.UserResource;

public class Test
{

	public static void main(String[] args)
	{
		UserResource u1 = new UserResource();
		u1.addUser(new User("mbm12eqwr31", "123", "05-06-1995", "mmehta@gmail.com", "Mihir", "Mehta"));
		/*
		 * String myString = "23_.?mihir_mehta@gmail.com";
		 * 
		 * EmailValidator emailAddr = EmailValidator.getInstance();
		 * 
		 * 
		 * System.out.println(emailAddr.isValid(myString));
		 * 
		 * //Email Validation #1 boolean testResult = myString.contains((Regex.EMAIL));
		 * 
		 * Matcher matcher = Regex.pattern.matcher(myString);
		 * 
		 * //System.out.println(matcher.matches());
		 */
	}

}

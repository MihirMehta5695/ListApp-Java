package com.mihir.listapp.test;

import java.util.regex.Matcher;

import org.apache.commons.validator.routines.EmailValidator;

import com.mihir.listapp.regex.Regex;

public class Test
{

	public static void main(String[] args)
	{
		String myString = "23_.?mihir_mehta@gmail.com";
		
		EmailValidator emailAddr = EmailValidator.getInstance();
		
		
		System.out.println(emailAddr.isValid(myString));
		
		//Email Validation #1
		/*boolean testResult = myString.contains((Regex.EMAIL));
		
		Matcher matcher = Regex.pattern.matcher(myString);*/ 
		
		//System.out.println(matcher.matches());

	}

}

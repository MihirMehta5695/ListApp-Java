package com.mihir.listapp.regex;

import java.util.regex.Pattern;

public class Regex
{

	public static final String DIGITS = "[0-9]+";

	public static final String NON_DIGITS = "[^0-9]+";

	public static final String LETTERS = "[a-zA-Z]+";

	public static final String NON_LETTERS = "[^a-zA-Z]+";

	public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public static final Pattern pattern = Pattern.compile(EMAIL);

}

package com.epam.pdp.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	private static String mailRegExp = "\\w{2,50}@[a-z]{1,20}\\.[a-z]{2,5}";
	private static String passportRegexp = "[A-Z]{2}\\d{6}";
	private static String mailString = "yuriy_veres@epam.com";
	private static String passportString = "KB123456";

	public static void main(String[] args) {

		Pattern mailPattern = Pattern.compile(mailRegExp);
		Pattern passportPattern = Pattern.compile(passportRegexp);

		Matcher mailMatcher = mailPattern.matcher(mailString);
		Matcher passportMatcher = passportPattern.matcher(passportString);

		if (mailMatcher.matches()) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is not valid");
		}

		if (passportMatcher.matches()) {
			System.out.println("Passport is valid");
		} else {
			System.out.println("Passport is not valid");
		}

	}

}

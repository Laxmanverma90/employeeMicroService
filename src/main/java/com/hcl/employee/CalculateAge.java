package com.hcl.employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateAge {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1990, 02, 15);
		Period p = Period.between(birthDate, currentDate);
		System.out.println("birthDate :: " + birthDate);
		System.out.println("currentDate :: " + currentDate);
		System.out.println("Age :: " + p.getYears());
		System.out.println("----------------------------");
		List<String> emails = new ArrayList<>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.co.in");
		emails.add("user@domaincom");
		emails.add("userdomaincom");
		emails.add("user#@domain.helllo");

		// Invalid emails
		emails.add("user#domain.com");
		emails.add("@yahoo.com");

		String regex = "^(.+)@(.+)$";
		// .+ matches any character (except for line terminators).
		// + Quantifier — Matches between one and unlimited times, as many times as
		// possible, giving back as needed.
		// @ matches the character @ literally (case sensitive).
		// Causes ^ and $ to match the begin/end of each line (not only begin/end of
		// string).
		
		//"^[A-Za-z0-9+_.-]+@(.+)$"
		Pattern pattern = Pattern.compile(regex);

		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
	}
}

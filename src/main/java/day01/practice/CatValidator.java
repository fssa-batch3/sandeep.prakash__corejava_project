package day01.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatValidator {

	public static boolean validate(Cat cat) {

		validateCatAge(cat.age);
		validateColorName(cat.color);
		validateSpeaks(cat.speaks);

		return true;
	}

	public static boolean validateCatAge(int age) throws IllegalArgumentException {
		// Assuming its a College Student with age range of
		// 17 to 20
	
		
		if (age > 0 && age <= 70) {
			return true;
		}
		
		throw new IllegalArgumentException("Age should be between 1 and 70");

	}

	public static boolean validateColorName(String input) throws IllegalArgumentException {
		if (input == null || "".equals(input.trim()) ) {
			throw new IllegalArgumentException("color Name cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,35}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(input);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("The color name should be  minimum 2 letters and maximum 35 letters");

		}

		return true;
	}

	public static boolean validateSpeaks(String input) throws IllegalArgumentException {
		if (input == null || "".equals(input.trim()) ) {
			throw new IllegalArgumentException("speaks tone name cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,35}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(input);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("speaks tone name should be  minimum 2 letters and maximum 35 letters");

		}

		return true;

	}
}

package day01.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCatValidator {
	
	
	
//  for valid age
	@Test

	public void testValidage() {
		Assertions.assertTrue(CatValidator.validateCatAge(30));
	}

//  for invalid age
	@Test
	public void testInvalidage() {


		try {
			CatValidator.validateCatAge(0);
			Assertions.fail("Validateage failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Age should be between 1 and 70", ex.getMessage());
		}

	}
	
	
	
	
//  for valid ground  color name
	@Test

	public void testValidcolorname() {
		Assertions.assertTrue(CatValidator.validateColorName("samy"));
	}

//  for invalid color name
	@Test
	public void testInvalidcolorname() {

		try {
			CatValidator.validateColorName(null);
			Assertions.fail("validateColorName failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("color Name cannot be empty or null", ex.getMessage());
		}

		try {
			CatValidator.validateColorName("a");
			Assertions.fail("validateColorName failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The color name should be  minimum 2 letters and maximum 35 letters", ex.getMessage());
		}

	}
	
	
//  for valid speaks  name
	@Test

	public void testValidspeaksName() {
		Assertions.assertTrue(CatValidator.validateSpeaks("meow"));
	}

//  for invalid speaks name
	@Test
	public void testInvalidspeaksName() {

		try {
			CatValidator.validateSpeaks(null);
			Assertions.fail("validateSpeaks failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("speaks tone name cannot be empty or null", ex.getMessage());
		}

		try {
			CatValidator.validateSpeaks("o");
			Assertions.fail("validateSpeaks failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("speaks tone name should be  minimum 2 letters and maximum 35 letters", ex.getMessage());
		}

	}
	

}

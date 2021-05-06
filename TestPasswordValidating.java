package in.waterbillapp;

import static org.junit.Assert.*;
import in.waterbillingcalculator.PasswordValidation;
import org.junit.Test;

public class TestPasswordValidating {

	@Test
	public void checkpassword1() {
		String enteredPassword = "v1234567";
		boolean output = PasswordValidation.isValidPassword(enteredPassword);
		assertTrue(output);

	}

	@Test
	public void checkpassword2() {
		String enteredPassword = "abi12345";
		boolean output = PasswordValidation.isValidPassword(enteredPassword);
		assertTrue(output);

	}

	@Test
	public void checkpassword3() {
		String enteredPassword = "";
		boolean output = PasswordValidation.isValidPassword(enteredPassword);
		assertFalse(output);

	}

	@Test
	public void checkpassword4() {
		String enteredPassword = "abc12343577";
		boolean output = PasswordValidation.isValidPassword(enteredPassword);
		assertFalse(output);

	}
	@Test
	public void checkpassword5() {
		String enteredPassword="12345678";
		boolean output=PasswordValidation.isValidPassword(enteredPassword);
		assertTrue(output);
		
	}
}

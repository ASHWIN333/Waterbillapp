package in.waterbillapp;

import static org.junit.Assert.*;

import org.junit.Test;

import in.waterbillingcalculator.MobileNumberValidation;

public class TestMobileNumberValidation {

	@Test
	public void checkmobilenumber() {
		String mobileNumber="9876543212";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertTrue(value);
		
	}
	@Test
	public void checkmobilenumber1() {
		String mobileNumber="1111123456";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
		
	}
	@Test
	public void checkmobilenumber2() {
		String mobileNumber="-";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
		
	}
	@Test
	public void checkmobilenumber4() {
		String mobileNumber="9998763";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
	}
	@Test
	public void checkmobilenumber5() {
		String mobileNumber="";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
	}
	@Test
	public void checkmobilenumber6() {
		String mobileNumber="-9876543211";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
		
	}
	@Test
	public void checkmobilenumber7() {
		String mobileNumber="5512398764";
		boolean value=MobileNumberValidation.isValidMobileNumber(mobileNumber);
		assertFalse(value);
		
	}
	
	
	

}

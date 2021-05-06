package in.waterbillapp;

import static org.junit.Assert.*;


import org.junit.Test;

import in.waterbillingcalculator.WaterBill;

public class TestingWaterBill {

	@Test
	public void testCase1() {
		int units=10;
		String userType="Domestic";
		double costOfOneUnit=WaterBill.getPerUnitPrice(userType , units);
		assertEquals(5,costOfOneUnit,0);	
	}
	
	@Test
	public void testCase2() {
		int units=20;
		String type="Domestic";
		double costOfOneUnit=WaterBill.getPerUnitPrice(type , units);
		assertEquals(10,costOfOneUnit,0);
	}
	@Test
	public void testCase3() {
		int units=30;
		String type="Domestic";
		double costOfOneUnit=WaterBill.getPerUnitPrice(type , units);
		assertEquals(15,costOfOneUnit,0);
	}
	@Test
	public void testCase4() {
		int units=10;
		String type="Commercial";
		double costOfOneUnit=WaterBill.getPerUnitPrice(type , units);
		assertEquals(15,costOfOneUnit,0);
	}
	@Test
	public void testCase5() {
		int units=18;
		String type="Commercial";
		double costOfOneUnit=WaterBill.getPerUnitPrice(type , units);
		assertEquals(30,costOfOneUnit,0);
	}
	@Test
	public void testCase6() {
		int units=30;
		String type="Commercial";
		double costOfOneUnit=WaterBill.getPerUnitPrice(type , units);
		assertEquals(45,costOfOneUnit,0);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCase7() {
		int units=100000;
		String type="Commercial";
		WaterBill.getPerUnitPrice(type ,units);
	}
}
	


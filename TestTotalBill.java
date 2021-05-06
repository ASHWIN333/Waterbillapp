package in.waterbillapp;
import static org.junit.Assert.*;
import org.junit.Test;
import in.waterbillingcalculator.TotalBillManager;

public class TestTotalBill {

	@Test
	public void domestictestcase1() {
		int numberOfUnits=10;
		String  userType="Domestic";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(50,finalValue,0);
		
	}
	@Test
	public void domestictestcase2() {
		int numberOfUnits=20;
		String  userType="domestic";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(200,finalValue,0);
		
	}
	@Test
	public void domestictestcase3() {
		int numberOfUnits=60;
		String  userType="DomestiC";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(1800,finalValue,0);
		
	}
	@Test
	public void commercialtestcase1() {
		int numberOfUnits=10;
		String  userType="Commercial";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(150,finalValue,0);
		
	}
	@Test
	public void commercialtestcase2() {
		int numberOfUnits=20;
		String  userType="commercial";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(600,finalValue,0);
		
	}
	@Test
	public void commercialtestcase3() {
		int numberOfUnits=90;
		String  userType="COmmercial";
		int finalValue=TotalBillManager.getbill(userType,numberOfUnits);
		assertEquals(8100,finalValue,0);
	}
	@Test(expected = IllegalArgumentException.class)
	public void commercialtestcase4() {
		int units=100000;
		String type="Commercial";
		TotalBillManager.getbill(type ,units);
	}
	
	


}

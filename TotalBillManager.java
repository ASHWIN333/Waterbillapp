package in.waterbillingcalculator;

public class TotalBillManager {
	
	public static int getbill(String type,int units) {
		if(units < 0 || units > 100 ) {
			throw new IllegalArgumentException("Invalid Unit");
		}
		int cost=WaterBill.getPerUnitPrice(type, units);
		int finalCost=units*cost;
		return finalCost;
	}
}
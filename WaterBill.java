package in.waterbillingcalculator;

import java.util.ArrayList;


public class WaterBill {
	static ArrayList<PerUnitPrice> list = new ArrayList<PerUnitPrice>();
	static
	{
		PerUnitPrice domesticOneToTenkl = new PerUnitPrice();
		domesticOneToTenkl.minimumUnits=0;
		domesticOneToTenkl.maximumUnits=10;
		domesticOneToTenkl.price=5;
		domesticOneToTenkl.type="Domestic";
		
		PerUnitPrice domesticElevenToTwentyFivekl = new PerUnitPrice();
		domesticElevenToTwentyFivekl.minimumUnits=11;
		domesticElevenToTwentyFivekl.maximumUnits=25;
		domesticElevenToTwentyFivekl.price=10;
		domesticElevenToTwentyFivekl.type="Domestic";
		
		PerUnitPrice domesticTwentySixToFiftykl = new PerUnitPrice();
		domesticTwentySixToFiftykl.minimumUnits=26;
		domesticTwentySixToFiftykl.maximumUnits=50;
		domesticTwentySixToFiftykl.price=15;
		domesticTwentySixToFiftykl.type="Domestic";
		
		PerUnitPrice domesticFiftyOneToHundredkl = new PerUnitPrice();
		domesticFiftyOneToHundredkl.minimumUnits=51;
		domesticFiftyOneToHundredkl.maximumUnits=100;
		domesticFiftyOneToHundredkl.price=30;
		domesticFiftyOneToHundredkl.type="Domestic";
		
		
		PerUnitPrice commercialOneToTenkl = new PerUnitPrice();
		commercialOneToTenkl.minimumUnits=0;
		commercialOneToTenkl.maximumUnits=10;
		commercialOneToTenkl.price=15;
		commercialOneToTenkl.type="Commercial";
		
		PerUnitPrice commercialElevenToTwentyFivekl = new PerUnitPrice();
		commercialElevenToTwentyFivekl.minimumUnits=11;
		commercialElevenToTwentyFivekl.maximumUnits=25;
		commercialElevenToTwentyFivekl.price=30;
		commercialElevenToTwentyFivekl.type="Commercial";
		
		PerUnitPrice commercialTwentySixToFiftykl = new PerUnitPrice();
		commercialTwentySixToFiftykl.minimumUnits=26;
		commercialTwentySixToFiftykl.maximumUnits=50;
		commercialTwentySixToFiftykl.price=45;
		commercialTwentySixToFiftykl.type="Commercial";
		
		PerUnitPrice commercialFiftyOneToHundredKl = new PerUnitPrice();
		commercialFiftyOneToHundredKl.minimumUnits=51;
		commercialFiftyOneToHundredKl.maximumUnits=100;
		commercialFiftyOneToHundredKl.price=90;
		commercialFiftyOneToHundredKl.type="Commercial";
		
		list.add(domesticOneToTenkl);
		list.add(domesticElevenToTwentyFivekl);
		list.add(domesticTwentySixToFiftykl);
		list.add(domesticFiftyOneToHundredkl);
		list.add(commercialOneToTenkl);
		list.add(commercialElevenToTwentyFivekl);
		list.add(commercialTwentySixToFiftykl);
		list.add(commercialFiftyOneToHundredKl);
	}
	public static int getPerUnitPrice(String type, int units)
	{
		if(units < 0 || units > 100 ) {
			throw new IllegalArgumentException("Invalid Unit");
		}
		
		int costOfOneUnit = 0;
		for (PerUnitPrice perUnitPrice : list) {
			if(perUnitPrice.type.equalsIgnoreCase(type) && units >= perUnitPrice.minimumUnits && units<= perUnitPrice.maximumUnits)
			{
				costOfOneUnit=perUnitPrice.price;
				break;
			}
		}
		return costOfOneUnit;
		
	}
}

package in.waterbillingcalculator;

import java.util.ArrayList;


public class WaterBill {
	static ArrayList<PerUnitPrice> list = new ArrayList<PerUnitPrice>();
	static
	{
		PerUnitPrice domesticOneToTenkl = new PerUnitPrice();
		domesticOneToTenkl.minimumUnits=0;
		domesticOneToTenkl.maximumUnits=10;
		domesticOneToTenkl.price=4;
		domesticOneToTenkl.type="Domestic";
		
		PerUnitPrice domesticElevenToFifteenkl = new PerUnitPrice();
		domesticElevenToFifteenkl.minimumUnits=11;
		domesticElevenToFifteenkl.maximumUnits=15;
		domesticElevenToFifteenkl.price=16;
		domesticElevenToFifteenkl.type="Domestic";
		
		PerUnitPrice domesticSixteenToTwentyFivekl = new PerUnitPrice();
		domesticSixteenToTwentyFivekl.minimumUnits=16;
		domesticSixteenToTwentyFivekl.maximumUnits=25;
		domesticSixteenToTwentyFivekl.price=24;
		domesticSixteenToTwentyFivekl.type="Domestic";
		
		PerUnitPrice domesticTwentySixToHundredkl = new PerUnitPrice();
		domesticTwentySixToHundredkl.minimumUnits=26;
		domesticTwentySixToHundredkl.maximumUnits=100;
		domesticTwentySixToHundredkl.price=40;
		domesticTwentySixToHundredkl.type="Domestic";
		
		
		PerUnitPrice commercialOneToTenkl = new PerUnitPrice();
		commercialOneToTenkl.minimumUnits=0;
		commercialOneToTenkl.maximumUnits=10;
		commercialOneToTenkl.price=8;
		commercialOneToTenkl.type="Commercial";
		
		PerUnitPrice commercialElevenToFifteenkl = new PerUnitPrice();
		commercialElevenToFifteenkl.minimumUnits=11;
		commercialElevenToFifteenkl.maximumUnits=15;
		commercialElevenToFifteenkl.price=25;
		commercialElevenToFifteenkl.type="Commercial";
		
		PerUnitPrice commercialSixteenToHundredKl = new PerUnitPrice();
		commercialSixteenToHundredKl.minimumUnits=16;
		commercialSixteenToHundredKl.maximumUnits=100;
		commercialSixteenToHundredKl.price=40;
		commercialSixteenToHundredKl.type="Commercial";
		
		list.add(domesticOneToTenkl);
		list.add(domesticElevenToFifteenkl);
		list.add(domesticSixteenToTwentyFivekl);
		list.add(domesticTwentySixToHundredkl);
		list.add(commercialOneToTenkl);
		list.add(commercialElevenToFifteenkl);
		list.add(commercialSixteenToHundredKl);
	}
	public static int getPerUnitPrice(String type, int units)
	{
		if(units <= 0 || units > 101 ) {
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


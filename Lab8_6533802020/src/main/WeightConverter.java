package main;



public class WeightConverter {

	
		public WeightConverter() {
			
		}


		public double convert(double massValue, String fromUnit, String toUnit) {
			double result = 0.0;
			
			result = massValue*getMultiplier(fromUnit, toUnit);
			
			return result;
		}
		
		
	
		public double getMultiplier(String fromUnit, String toUnit) {
			double multiplier = 1.0;
			
			if (fromUnit.equals("kilogram")) {
				if (toUnit.equals("gram")) {
					multiplier = 1.0/1000;
				} else if (toUnit.equals("lbs")) {
					multiplier = 2.205;
				} else if (toUnit.equals("ounce")) {
					multiplier = 35.274;
				}
			} else if (fromUnit.equals("gram")) {
				if (toUnit.equals("kilogram")) {
					multiplier = 1000;
				} else if (toUnit.equals("lbs")) {
					multiplier = 0.0022;
				} else if (toUnit.equals("ounce")) {
					multiplier = 0.035;
				}
			} else if (fromUnit.equals("lbs")) {
				if (toUnit.equals("kilogram")) {
					multiplier = 1.0/2.205;
				} else if (toUnit.equals("gram")) {
					multiplier = 1000.0/2.205;
				} else if (toUnit.equals("ounce")) {
					multiplier = 16;
				}
			} else if (fromUnit.equals("once")) {
				if (toUnit.equals("kilogram")) {
					multiplier = 1.0/35.274;
				} else if (toUnit.equals("gram")) {
					multiplier = 28.35;
				} else if (toUnit.equals("lbs")) {
					multiplier = 1.0/16;
				}
			}
			
			return multiplier;
		}
}


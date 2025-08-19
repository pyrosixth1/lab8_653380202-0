package main;



public class TemperatureConverter {
		
		
		public TemperatureConverter() {
			
		}


		public double convert(double tempValue, String fromUnit, String toUnit) {
			double result = 0.0;
			
			if (fromUnit.equals("C")) {
				if (toUnit.equals("F")) {
					result = tempValue*(9/5)+32;
				} else if (toUnit.equals("K")) {
					result = tempValue + 273.15;
				}
			} else if (fromUnit.equals("F")) {
				if (toUnit.equals("C")) {
					result = (tempValue-32) * (5/9);
				} else if (toUnit.equals("K")) {
					result = (tempValue-32) * (5/9) + 273.15;
				}
			} else if (fromUnit.equals("K")) {
				if (toUnit.equals("C")) {
					result = tempValue - 273.15;
				} else if (toUnit.equals("F")) {
					result = (tempValue-273.15) * (9/5) + 32;
				}		
			}
			
			return result;
		}
}


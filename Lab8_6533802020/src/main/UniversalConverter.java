package main;


public class UniversalConverter {

		
		public UniversalConverter() {
			
		}
		
		
		public double convert(double value, String choice, String fromUnit, String toUnit) {
			double result = 0.0;
			DistanceConverter distanceConverter = new DistanceConverter();
			WeightConverter weightConverter = new WeightConverter();
			TemperatureConverter tempConverter = new TemperatureConverter();
			
			if (choice.equals("Distance")) {
				result = distanceConverter.convert(value, fromUnit, toUnit);
			} else if (choice.equals("Weight")) {
				result = weightConverter.convert(value, fromUnit, toUnit);
			} else if (choice.equals("Temperature")) {
				result = tempConverter.convert(value, fromUnit, toUnit);
			}
				
			return result;
		}
}

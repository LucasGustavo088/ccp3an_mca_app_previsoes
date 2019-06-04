package usjt_ccp3anmca_observer;

public class ThirdPartyDisplay extends Display {

	@Override
	public void update(double temperatura, double humidity, double pressure) {
		//(0 °C × 9/5) + 32 = 32 °F
		double f = (temperatura * (9/5)) + 32;
		/*-42.379 + 2.04901523 * temperatura + 10.14333127 * humidity
		- 0.22475541 * temperatura * humidity - 6.83783 
		* (Math.pow(10, -3)) * (Math.pow(temperatura, 2)) - 5.481717 
		* (Math.pow(10, -2)) * (Math.pow(humidity, 2)) + 1.22874 
		* (Math.pow(10, -3)) * (Math.pow(temperatura, 2)) 
		* humidity + 8.5282 * (Math.pow(10, -4)) * temperatura 
		* (Math.pow(humidity, 2)) - 1.99 * (Math.pow(10, -6)) 
		* (Math.pow(temperatura, 2)) * (Math.pow(humidity,2));
		* */

		double heatIndex = -42.379 + 2.04901523 * f + 10.14333127 * humidity
				- 0.22475541 * f * humidity - 6.83783 
				* (Math.pow(10, -3)) * (Math.pow(f, 2)) - 5.481717 
				* (Math.pow(10, -2)) * (Math.pow(humidity, 2)) + 1.22874 
				* (Math.pow(10, -3)) * (Math.pow(f, 2)) 
				* humidity + 8.5282 * (Math.pow(10, -4)) * f 
				* (Math.pow(humidity, 2)) - 1.99 * (Math.pow(10, -6)) 
				* (Math.pow(f, 2)) * (Math.pow(humidity,2));
		
		System.out.println("------ ThirdParty ------\n");
		System.out.printf("Heat Index: %.2f\n\n", heatIndex);

	}

	@Override
	public void display() {
		

	}

}

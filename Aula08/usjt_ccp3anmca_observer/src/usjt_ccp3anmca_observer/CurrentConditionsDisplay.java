package usjt_ccp3anmca_observer;

public class CurrentConditionsDisplay extends Display {

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(double temperatura, double humidity, double pressure) {
		System.out.println("-----Condicoes atuais-------");
		System.out.printf("Temp: %.0f, Hum: %.0f%%,Pres: %.2f\n", temperatura,humidity,pressure);
		
	}

}

package usjt_ccp3anmca_observer;

import java.util.Random;

public class ForecastDisplay extends Display {
	private Random gerador=new Random();
	@Override
	public void display() {
		

	}

	@Override
	public void update(double temperatura, double humidity, double pressure) {
		double previsao =temperatura - 2 + gerador.nextDouble() * 4;
		System.out.println("------ Previsoes ------\n");
		System.out.printf("Previsao para o proximo dia: %.2f\n", previsao);
		
	}

}

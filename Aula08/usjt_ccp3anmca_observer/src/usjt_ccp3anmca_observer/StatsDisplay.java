package usjt_ccp3anmca_observer;

public class StatsDisplay extends Display {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	private int qtde = 0;
	private double totalHistorico = 0;
	@Override
	public void update(double temperatura, double humidity, double pressure) {
		qtde++;
		totalHistorico+=temperatura;
		System.out.println("---- Dados Estatisticos ----");
		System.out.printf("Media: %.2f\n",totalHistorico/qtde);
	}

}

package usjt_ccp3anmca_observer;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData estacaoMonitoramento = new WeatherData();
		CurrentConditionsDisplay d1 = new CurrentConditionsDisplay();
		StatsDisplay d2 =  new StatsDisplay();
		ForecastDisplay d3 =  new ForecastDisplay();
		ThirdPartyDisplay d4 = new ThirdPartyDisplay();
		
		estacaoMonitoramento.registerObserver(d1);
		estacaoMonitoramento.registerObserver(d2);
		estacaoMonitoramento.registerObserver(d3);
		estacaoMonitoramento.registerObserver(d4);
		estacaoMonitoramento.iniciar();
	}

}

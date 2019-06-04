package usjt_ccp3anmca_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	
	public WeatherData() {
		this.observers = new LinkedList<>();
	}
	
	private double temperature;
	private double pressure;
	private double humidity;
	
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	
	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}


	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}


	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(temperature,humidity,pressure);
		}
		
	}
	
	public void iniciar() {
		Random gerador =  new Random();
			while(true) {
				temperature = 30 + gerador.nextDouble() *5;
				humidity = 20 + gerador.nextDouble() * 55;
				pressure = 800 + gerador.nextDouble() * 400;
				measurementsChanged();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}

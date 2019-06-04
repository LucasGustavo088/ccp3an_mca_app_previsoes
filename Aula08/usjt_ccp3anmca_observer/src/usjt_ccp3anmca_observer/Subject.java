package usjt_ccp3anmca_observer;

public interface Subject {
	public void registerObserver (Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}

package ml.observer;

public interface Observable {
	public abstract void addObserver(Observer observer);
	public abstract void removeObsever(Observer observer);
	public abstract void notifyObservers();
	public abstract WeatherType getData();
}

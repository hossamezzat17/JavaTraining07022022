package observer;

public interface Observable {

	public abstract void addObserver(Observer observer);
	public abstract void removeObserver(Observer observer);
	//public abstract void notifyObservers();
	public abstract String getData();
	
}

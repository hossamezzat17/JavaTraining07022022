package observer;

import java.util.ArrayList;
import java.util.List;

public class Joke implements Observable {

	private List<Observer> observers;
	private String joke;

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
		this.notifyObservers();
	}

	private List<Observer> getObservers() {
		return observers;
	}

	private void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public Joke() {
		this.setObservers(new ArrayList<>());
	}

	@Override
	public void addObserver(Observer observer) {
		this.getObservers().add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.getObservers().remove(observer);
	}

	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	@Override
	public String getData() {
		return this.getJoke();
	}
}

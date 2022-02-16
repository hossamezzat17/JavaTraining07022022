package ml.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.Timer;

/**
 * Die Klasse Wetter ändert seinen zustand(WeatherType) per Zufall
 *
 */
public class Wetter implements Observable {

	private WeatherType weatherType;
	private List<Observer> observers;

	public WeatherType getWeatherType() {
		return weatherType;
	}

	/**
	 * Wenn aufgerufen, dann werden die Observer im nachhinein benachrichtigt.
	 */
	public void setWeatherType(WeatherType weatherType) {
		this.weatherType = weatherType;
		this.notifyObservers();
	}

	private List<Observer> getObservers() {
		return observers;
	}

	private void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public Wetter() {
		this.setObservers(new ArrayList<>());
		
		Random rand = new Random();
		final int max = WeatherType.values().length;
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WeatherType weatherType =WeatherType.values()[rand.nextInt(max)];
				System.out.println("Das Wetter wechselt zu " + weatherType.getDescription());
				setWeatherType(weatherType);
			}
		};
		
		Timer timer = new Timer(500,al);
		timer.start();
	}

	@Override
	public void addObserver(Observer observer) {
		this.getObservers().add(observer);
	}

	@Override
	public void removeObsever(Observer observer) {
		this.getObservers().remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for (Observer observer : observers) {
			observer.update(this);
		}
		
//		this.getObservers().forEach(o->o.update(this));
	}

	@Override
	public WeatherType getData() {
		return this.getWeatherType();
	}

}

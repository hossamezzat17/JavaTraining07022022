package ml.observer;

public class Applikation {
	public static void main(String[] args) {
		Wetter wetter = new Wetter();
		wetter.addObserver(new Camper());
		wetter.addObserver(new Walker());
		wetter.addObserver(new Fishermen());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main beendet");
	}
	
}

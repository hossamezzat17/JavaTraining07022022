package observer;

import java.util.concurrent.ThreadLocalRandom;

public class PCObserver implements Observer {

	@Override
	public void update(Observable observable) {
		
		if(ThreadLocalRandom.current().nextBoolean()) {
			System.out.println("PCObserver sagt das war nicht Korrekt");
		} else {
			System.out.println("PCObserver sagt das war in Ordnung");
		}
		
	}

}

package ml.observer;

public class Camper implements Observer {

	@Override
	public void update(Observable observable) {
		switch (observable.getData()) {
		case SUNNY: {
		}
		case CLOUDY: {
			System.out.println(this.getClass().getSimpleName() + " unternimmt etwas");
			break;
		}
		case RAINY: {
			System.out.println(this.getClass().getSimpleName() + " spielt Karten im Zelt");
		}
		default: {
			break;
		}

		}

	}

}

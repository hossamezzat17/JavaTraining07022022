package ml.observer;

public class Fishermen implements Observer {

	@Override
	public void update(Observable observable) {
		switch (observable.getData()) {
		case SUNNY: {
		}
		case CLOUDY: {
			System.out.println(this.getClass().getSimpleName() + " geht Angeln");
			break;
		}
		case RAINY: {
			System.out.println(this.getClass().getSimpleName() + " sammelt Köder");
		}
		default: {
			break;
		}
		}

	}

}

package ml.observer;

public class Walker implements Observer {

	@Override
	public void update(Observable observable) {
		switch (observable.getData()) {
		case ICY: {
		}
		case STORMY: {
		}
		case RAINY: {
			System.out.println(this.getClass().getSimpleName() + " sucht einen Unterschlupf");
			break;
		}
		default: {
			System.out.println(this.getClass().getSimpleName() + " geht Wandern");
		}
		}

	}

}

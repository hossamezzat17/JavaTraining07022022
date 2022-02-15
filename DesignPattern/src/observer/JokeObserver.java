package observer;

public class JokeObserver implements Observer {

	@Override
	public void update(Observable observable) {
		if (observable instanceof Joke joke) {
			System.out.println("JokeObserver hört : " + joke.getData());
		}
	}

}

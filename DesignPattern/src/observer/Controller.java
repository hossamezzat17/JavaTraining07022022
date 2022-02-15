package observer;

public class Controller {

	public static void main(String[] args) {
		Joke joke = new Joke();
//		PCObserver pcObserver = new PCObserver();
//		JokeObserver jokeObserver = new JokeObserver();
//		joke.addObserver(pcObserver);
//		joke.addObserver(jokeObserver);
		
		joke.addObserver(new PCObserver());
		joke.addObserver(new JokeObserver());
		
		Narrator narrator = new Narrator(joke);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

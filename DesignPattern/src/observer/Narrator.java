package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Narrator {

	private Joke joke;

	public Joke getJoke() {
		return joke;
	}

	public void setJoke(Joke joke) {
		this.joke = joke;
	}

	public Narrator(Joke joke) {
		this.setJoke(joke);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getJoke().setJoke("Hallo Welt");
			}
		};
		Timer timer = new Timer(250, al);
		timer.start();
	}
}

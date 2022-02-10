package threads01;

class Demo09Shared{
	static int count;
}

class Demo09Runnable implements Runnable {
	public void run() {
		/**
		 * Befinden wir uns in einen Thread X
		 */
		for (int i = 0; i < 1_000_000; i++) {
			synchronized (Demo09Shared.class) {
				Demo09Shared.count++;
			}
			
		}
		System.out.println("Count im Run = " + Demo09Shared.count);
	}
}

public class Demo09_Join {

	public static void main(String[] args) {
		Runnable target = new Demo09Runnable();
		Thread t1 = new Thread(target);
		t1.start();

		/**
		 * Möglich auftretende 'Race Condition'
		 */
		Thread t2 = new Thread(target);
		t2.start();
		
		/**
		 * Wir befinden uns im laufenden Thread main
		 * 
		 * main solange pausieren bis Thread X fertig ist.
		 */
		
		/**
		 * Instanz Methode 'join' der Klasse Thread
		 * 
		 * join(); join(long millis); join(long millis, int nanos);
		 * 
		 * - join hält den Thread an, in dem sie aufgerufen wurde (hier: main)
		 * 
		 * - join wird beendet, wenn der Thread zu dem sie aufgerufen wurde vorbei ist
		 * (hier: t1)
		 * 
		 * - join wird den aufrufenden Thread (hier: main) nicht anhalten, wenn der
		 * Thread zu dem sie aufgerufen wurde NEW ist
		 */
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count im Main = " + Demo09Shared.count);
	}

}

package threads01;

public class Demo08_API {
	public static void main(String[] args) {
		statischeThreadMethoden();
		instanzThreadMethoden();
	}

	
	private static void instanzThreadMethoden() {
		/**
		 * Konstruktoren
		 */
		Thread t1 = new Thread(); //Default
		
		// Mit angabe eines Runnables, hier als Lambda
		Thread t2 = new Thread(()-> {   });
		
		String name = "Fred";
		// Mit angabe eines Namens für den Thread
		Thread tFred = new Thread(name);
		// Mit angabe eines Runnable und eines Namens für den Thread
		Thread tBarney = new Thread(() -> {}, "Barney");
		
		/**
		 * getName()
		 * 
		 * setName()
		 */
		tFred.setName("Wilma");
		System.out.println(tFred);
	}

	/**
	 * Die Klasse Thread bietet 4 zugängliche Statische Methoden, die wir verwenden
	 * können.
	 * 
	 */
	private static void statischeThreadMethoden() {

		/**
		 * currentThread
		 */
		System.out.println("currentThread = " + Thread.currentThread());

		/**
		 * yield() - Versuch das dieser Thread in den Runnable versetzt wird.
		 * 
		 * A hint to the scheduler that the current thread is willing to yield its
		 * current use of a processor. The scheduler is free to ignore this hint.
		 * 
		 * Ein Hinweis an den Scheduler, dass der aktuelle Thread bereit ist, seine die
		 * aktuelle Nutzung eines Prozessors aufzugeben. Es steht dem Scheduler frei,
		 * diesen Hinweis zu ignorieren
		 * 
		 */
		Thread.yield();
		
		/**
		 * sleep(long millis)
		 * 
		 * sleep(long millis, int nano)
		 */
		try {
			Thread.sleep(1000);
			Thread.sleep(1000,555);
		} catch (InterruptedException e) {
			System.out.println("In diesem Bsp. wird es zu keiner Exception kommen");
		}
		
	}
}

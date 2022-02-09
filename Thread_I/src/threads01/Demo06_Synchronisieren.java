package threads01;

public class Demo06_Synchronisieren {

	static final int ITERATIONS = 1_000_000;
	static int count = 0;

	public static void main(String[] args) {
		Runnable target = new Runnable() {

			/**
			 * Instanz Methoden welche Synchronisiert werden, werden mit dem
			 * Schl�ssel/Monitor this synchronisiert.
			 */
			@Override
			public synchronized void run() {
				int i = 0;

				for (; i < ITERATIONS; i++) {
					/**
					 * Synchronisieren mit einem Statischen Schl�ssel.
					 * 
					 * Bedeutet der Schl�ssel ist nur 1 einziges mal vorhanden je JVM-(Classloader).
					 * 
					 * Konkurrierende Thread teilen sich den Schl�ssel und nur der Thread, welcher
					 * den Schl�ssel besitzt kann den damit Synchronisierten Block betreten.
					 */
					synchronized (Demo06_Synchronisieren.class) {
						count++;
					}
				}
				System.out.println("Thread " + Thread.currentThread().getId() + " ist fertig : " + i);
			}
		};

		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);

		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count : " + count);
	}
}

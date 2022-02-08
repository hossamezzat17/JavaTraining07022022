package threads01;

public class Demo01_Thread_Starten {

	public static void main(String[] args) {
		thread01();
		thread02();
	}
	
	/**
	 * Erzeugen einen Thread, der etwas ausführt.
	 * 
	 * - Interface Runnable
	 */
	private static void thread02() {
		Runnable target = new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
						System.out.println("Unser erster Thread mit einem Runnable");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t1 = new Thread(target);
		t1.start();
	}
	

	/**
	 * Standard Thread erzeugt und gestartet.
	 */
	public static void thread01() {
		/**
		 * Reservieren eines Threads - NEW
		 */
		Thread t1 = new Thread();

		/**
		 * Wir registrieren unseren Thread beim Scheduler, damit geht der Thread vom
		 * Zustand 'NEW' -> 'Runnable' über.
		 * 
		 * Unser Thread wird dem 'Threadpool' hinzugefügt
		 */
		t1.start();
	}
}

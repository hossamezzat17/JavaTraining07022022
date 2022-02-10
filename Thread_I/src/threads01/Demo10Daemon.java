package threads01;

public class Demo10Daemon {

	public static void main(String[] args) {
		Runnable target = new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Ich bin ein Daemon");
				}
			}
		};

		Thread t1 = new Thread(target);
		t1.setDaemon(true);
		t1.start();
		
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main beendet");
	}

}

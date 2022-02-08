package threads01;

/**
 * Schlechtes Beispiel
 * 
 * mit Runnable besser umgesetzt
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
//    if (target != null) {
//        target.run();
//	  }
		System.out.println("MyThread");
	}

}

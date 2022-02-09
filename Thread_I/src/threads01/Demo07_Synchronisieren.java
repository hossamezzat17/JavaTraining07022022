package threads01;

public class Demo07_Synchronisieren {

	static class ValueHolder {
		int value;

		void increment() {
			value++;
		}

//		synchronized void increment() {
//			value++;
//		}

//		void increment() {
//			synchronized (this) {
//				value++;
//			}
//		}

//		void increment() {
//		synchronized (ValueHolder.class) {
//			value++;
//		}

	}

	public static void main(String[] args) {

		long before = System.currentTimeMillis();
		/**
		 * X Threads sollen den Value um je 1 erhöhen
		 */
		ValueHolder vh1 = new ValueHolder();
		Runnable targetVH1 = new Runnable() {
			@Override
			public void run() {
				vh1.increment();
			}
		};

		for (int i = 0; i < 25_000; i++) {
			Thread tmp = new Thread(targetVH1);
			tmp.start();
		}

		/**
		 * X Threads sollen den Value um je 1 erhöhen
		 */
		ValueHolder vh2 = new ValueHolder();
		Runnable targetVH2 = new Runnable() {
			@Override
			public void run() {
				vh2.increment();
			}
		};

		for (int i = 0; i < 25_000; i++) {
			Thread tmp = new Thread(targetVH2);
			tmp.start();
		}

		long after = System.currentTimeMillis();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Zeit vergangen in ms " + (after - before));
		System.out.println("vh1.value : " + vh1.value);
		System.out.println("vh2.value : " + vh2.value);
	}

}

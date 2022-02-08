package threads01;

public class Demo04_Scopes {

	public static void main(String[] args) {
		int i = 42;
		
		Runnable target = new Runnable() {
			@Override
			public void run() {
				int i = 64;
				System.out.println("i = " + i);
			}
		};
		
		Thread t1 = new Thread(target);
		t1.start();
		
		System.out.println("i = " + i);
	}
}

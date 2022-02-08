package threads01;

//class MyThread extends Thread {
//	@Override
//	public void run() {
////        if (target != null) {
////            target.run();
////        }
//		System.out.println("MyThread");
//	}
//}

public class Demo02_MyThread {

	public static void main(String[] args) {
		Thread t01 = new MyThread();

		t01.start();// -> ab hier sind 2 Threads vorhanden. 'main' als Thread nicht vergessen
		
		System.out.println("main");
	}
}

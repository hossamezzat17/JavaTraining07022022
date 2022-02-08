package threads01;

/**
 * Mit dem Problem 'Race Condition' wird beschrieben was passieren kann, wenn 2
 * Konkurrierende Threads einen gemeinsamen Bereich modifizieren.
 * 
 * Solch Konkurriende Modifikationen und die daraus entstehenden Nebeneffekte,
 * sind h�ufig die Gr�nde f�r schwer auffindbare Programmierfehler.
 * 
 * Volatile - Quelle:
 * https://www.zdnet.de/39198058/java-datenzugriffe-mit-dem-schluesselwort-i-volatile-i-synchronisieren/
 * 
 * Mithilfe des Schl�sselworts volatile l�sst sich der Zugriff auf eine Variable
 * synchronisieren. Ist eine Variable als volatile deklariert, muss die JVM
 * sicherstellen, dass alle zugreifenden Threads ihre Kopien aktualisieren,
 * sobald die Variable ge�ndert wird.
 * 
 * Das Schl�sselwort volatile biete da nur eine geringe Abhilfe. Es kommt auf
 * die zu erstellende Anwendung an.
 * 
 * Weiterf�hrender Link -
 * http://www.angelikalanger.com/Articles/EffectiveJava/42.JMM-volatileIdioms/42.JMM-volatileIdioms.html
 * 
 * In diesem Artikel werden die Regeln f�r Volatile Attribute wie folgt
 * bezeichnet.
 * 
 * Man kann den Zugriff auf Variablen mit volatile statt mit Locks
 * synchronisieren, wenn:
 * 
 * Regel 1: der zu schreibende neue Wert der Variablen unabh�ngig vom
 * gegenw�rtigen Wert ist, und
 * 
 * Regel 2: die Variable unabh�ngig von anderen Variablen ist.
 * 
 * W�re Volatile in dem hier gezeigtem Beispiel somit ein L�sung?
 * 
 * -Antwort : Nein - Verletzte Regel 1. count++ -> count = count + 1;
 * 
 */
public class Demo05_RaceCondition {

	static final int ITERATIONS = 1_000_000;

	static int count = 0;

	public static void main(String[] args) {
		Runnable target = new Runnable() {

			@Override
			public void run() {
				int i = 0;
				for (; i < ITERATIONS; i++) {
					count++;
					// count = count + 1;
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
		System.out.println("Count : " + count);// 1647042
	}
}

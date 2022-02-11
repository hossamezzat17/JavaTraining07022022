package singleton;

/**
 * Eager = eifrig
 * 
 * Eager, weil sofern die Klasse vom Classloader geladen wird, wird eine Instanz erzeugt.
 * 
 * Gilt per definition als ThreadSafe.
 * 
 * Singleton wird verwendet, wenn in der Applikation von einer Klasse nur ein
 * einziges Objekt bestehen darf.
 */
public class SingletonEagerSimple {

	private static final SingletonEagerSimple INSTANCE = new SingletonEagerSimple();

	public static SingletonEagerSimple getInstance(){
		return INSTANCE;
	}
	
	private SingletonEagerSimple() {
		
	}
}

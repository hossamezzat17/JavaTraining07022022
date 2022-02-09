package aufgaben;

/**
 * - Erzeugen Sie eine Klasse 'Printer', die so in der main-Methode eingesetzt
 * werden kann:
 * 
 * Printer p1 = new Printer('a', 10, 20); p1.start();
 * 
 * Printer p2 = new Printer('*', 15, 40); p2.start();
 *
 *
 *
 * - Jeder Printer soll in einem extra-Thread sein eigenes Zeichen
 * (Konstruktorparameter 1) in einer Zeile n Mal ausgeben (n ist
 * Konstruktorparameter 2). Am Ende der Zeile kommt ein Zeilenumbruch. Solche
 * Zeilen erzeugt jeder Printer m Mal (m ist Konstruktorparameter 3).
 * 
 * Gestalten Sie die Klasse Printer so, dass auf der Konsole 'saubere' Zeilen
 * erscheinen, in denen in einer Zeile sich nur ein Zeichen wiederholt. Eine
 * m�gliche Ausgabe w�rde dann in etwa so aussehen:
 * 
 * aaaaaaaaaa
 * **************
 * **************
 * **************
 * aaaaaaaaaa
 * aaaaaaaaaa
 * aaaaaaaaaa
 * **************
 * ...
 * 
 * 
 * nicht gewollte ausgaben:
 * aaa****aaa*a*a*a*
 * 
 */
public class AufgabeConsoleOutput {

	static class Printer extends Thread{
		public Printer(char ch, int charsInLine, int lines) {
			
		}
	}
	
	public static void main(String[] args) {
		Printer p1 = new Printer('a', 10, 20);
		p1.start();
		
		Printer p2 = new Printer('*', 15, 40);
		p2.start();

	}
}

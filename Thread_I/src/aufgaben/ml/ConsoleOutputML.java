package aufgaben.ml;

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
 * mögliche Ausgabe würde dann in etwa so aussehen:
 * 
 * <code>
 * aaaaaaaaaa
 * **************
 * **************
 * **************
 * aaaaaaaaaa
 * aaaaaaaaaa
 * aaaaaaaaaa
 * **************
 * ...
 * </code>
 * 
 * nicht gewollte ausgaben: aaa****aaa*a*a*a*
 * 
 */
public class ConsoleOutputML {

	static class Printer extends Thread {

		private char ch;
		private int charsInLine;
		private int lines;

		public Printer(char ch, int charsInLine, int lines) {
			this.ch = ch;
			this.charsInLine = charsInLine;
			this.lines = lines;
		}

		@Override
		public void run() {
			for (int j = 0; j < lines; j++) {
				printLine();
			}
		}

		/**
		 * ohne Synchronized
		 */
		private void printLine() {
			StringBuilder sb = new StringBuilder();
			/**
			 * Jeder Thread bedient seinen eigenen StringBuilder. Erst wenn dieser fertig
			 * erstellt ist, wird er auf der Konsole ausgegeben.
			 */
			for (int i = 0; i < charsInLine; i++) {
				sb.append(ch);
			}
			System.out.println(sb);
		}

		/**
		 * mit Synchronized
		 * 
		 * ---Key/Monitor : this -> 2 Objekte---
		 * 
		 * Key/Monitor : Printer.class
		 * 
		 * Somit ist der Synchronized Block für andere Threads gelockt und kann nicht
		 * betreten werden. Erst wenn der Thread mit dem Key den Synchronized Block
		 * verlässt, können andere Threads diesen betreten.
		 * 
		 */
//		private void printLine() {
//			synchronized (Printer.class) {
//				for (int i = 0; i < charsInLine; i++) {
//					System.out.print(ch);
//				}
//				System.out.println();
//			}
//		}
	}

	public static void main(String[] args) {
		Printer p1 = new Printer('a', 10, 20);
		p1.start();

		Printer p2 = new Printer('*', 15, 40);
		p2.start();

	}

}

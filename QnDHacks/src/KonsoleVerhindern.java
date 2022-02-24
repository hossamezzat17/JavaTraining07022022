import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

public class KonsoleVerhindern {

	public static void main(String[] args) throws FileNotFoundException {
//		System.out.println("Hallo SYSOUT vor dem Close");
//		System.out.close();
		
		
		System.out.println("Hallo SYSOUT vor dem umleiten");
		System.setOut(new PrintStream("./log.txt"));
//		System.setOut(new PrintStream(new FileOutputStream(new File("./log.txt"), true)));
		
		
		SecondClass.doStuff();

		System.out.println("Hallo SYSOUT nach dem umleiten");
//		System.out.println("Hallo SYSOUT nach dem Close");

	}

}

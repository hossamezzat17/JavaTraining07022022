
@FunctionalInterface
interface MyFuncInterface01 {
	public abstract Object doStuff();
}

@FunctionalInterface
interface MyFuncInterface02 {
	public abstract Object doStuff(String text);
}
@FunctionalInterface
interface MyCalculator {
	public abstract int calculate(int a,int b);
}

class MyUtilityCalc {
	public static int addieren(int a,int b) {
		return a+b;
	}
	
	public static int multiplizieren(int a,int b) {
		return a*b;
	}
	 
	public static Object repeatText(String text) {
		return text+text;
	}
}


public class Example01 {

	MyCalculator calc01 = (int a,int b) -> {return a+b;};
	MyCalculator calc02 = MyUtilityCalc::addieren;
	MyCalculator calc03 = MyUtilityCalc::multiplizieren;
	static MyFuncInterface02 repeater = MyUtilityCalc::repeatText;
	
	public static void main(String[] args) {
		System.out.println(repeater.doStuff("Hello World"));
	}
}

package gen05.lowerbound;

/**
 * Lowerbound wird mit 'super' festgelegt
 * 
 * Klassen und Interfaces können nicht per Lowerbound generisch gebunden werden.
 *
 */
//interface Schnittstelle<E super Number>{ }
//public class Demo01LowerBound <E super Number>{

public class Demo01LowerBound {

//	Syntax error on token "super", , expected
//	public <T super Number> void genMethode01(T t ) {}
//	public static <T super Number> void genMethode01(T t ) {}

	public static void genMethodDouble(GenKlasse<Double> gen) {
		gen.print();
	}

	public static void genMethodInteger(GenKlasse<Integer> gen) {
	}

	public static void genMethodNumber(GenKlasse<Number> gen) {
		gen.setT(42);
		gen.setT(42.00);
		gen.setT(42F);
		Number n = gen.getT();// Number gen05.lowerbound.GenKlasse.getT()
	}
	
	public static void genMethodNumberLowerBound(GenKlasse<? super Number> gen) {
		gen.getT();//Object gen05.lowerbound.GenKlasse.getT()
		
	}

	public static void genMethodNumberUpperBound(GenKlasse<? extends Number> gen) {
		gen.getT();//Number gen05.lowerbound.GenKlasse.getT()
		
	}
	
	public static void genMethodUndetermined(GenKlasse<?> gen){
		gen.getT();//Object gen05.lowerbound.GenKlasse.getT()
	}
}

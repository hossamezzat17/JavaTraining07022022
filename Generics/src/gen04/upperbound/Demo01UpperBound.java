package gen04.upperbound;

/**
 * 
 * Upperbound leiten wir mit 'extends' ein
 *
 */
//The type parameter Integer is hiding the type Integer
//interface UpperBounded<Integer extends Number>{
//	public abstract Integer getData(Integer i);
//}

interface UpperBounded<N extends Number, S, T, U> {
	public abstract N getNData(N i);

	public abstract S getSData(N i);

	public abstract T getTData(N i);

	public abstract U getUData(N i);
}

public class Demo01UpperBound<E extends Number> {

	public E getEData(E e) {
		System.out.println(e.getClass());
		return e;
	}

	public <T> void methodeMitNeuenGenerischenTyp(T t) {
		System.out.println(t.getClass());
	};
	
	public <T extends Number> T methodeMitNeuenGenerischenTypUndRueckgage(T t) {
		System.out.println(t.getClass());
		return t;
	}

}

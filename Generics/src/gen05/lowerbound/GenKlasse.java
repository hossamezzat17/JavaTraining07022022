package gen05.lowerbound;

public class GenKlasse<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenKlasse() {

	}

	public void print() {
		System.out.println("generische Klasse");
	}
}

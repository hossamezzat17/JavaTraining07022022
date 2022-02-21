package gen02;

/**
 *
 *
 * @param <T> T Type Datentyp
 */
public class Punkt<T> {

	private T x;
	private T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public Punkt() {

	}

	@Override
	public String toString() {
		return "Punkt [getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
}

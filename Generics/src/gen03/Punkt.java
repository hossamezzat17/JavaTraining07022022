package gen03;

/**
 * 
 *
 * @param <T> Alle Datentypen welche von der Klasse Number abgeleitet sind,
 *            können verwendet werden.
 */
public class Punkt<T extends Number> {

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

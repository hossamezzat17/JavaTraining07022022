package builder;

public enum Tires {
	SUMMER, WINTER, ALLSEASON, OFFROAD, SLICK;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}

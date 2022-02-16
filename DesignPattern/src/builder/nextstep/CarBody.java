package builder.nextstep;

public enum CarBody {
	COMPACT,STATION_WAGON,CABRIO,SUV,LIMOUSINE;
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}

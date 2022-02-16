package ml.observer;

public enum WeatherType {
	CLOUDY("Wolkig"), SUNNY("Sonnig"), RAINY("Regnerisch"), STORMY("Stuermisch"), ICY("Eisig");

	private final String description;

	public String getDescription() {
		return description;
	}

	private WeatherType(String description) {
		this.description = description;
	}
	
	public boolean isBadWeather() {
		return this == RAINY || this == STORMY || this == ICY;
	}
}

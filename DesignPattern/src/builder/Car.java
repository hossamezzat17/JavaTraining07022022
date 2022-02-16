package builder;

public class Car {
	private CarBody carBody;
	private Color color;
	private Motor motor;
	private Tires tires;

	public CarBody getCarBody() {
		return carBody;
	}

	public void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	/**
	 * Die Werte werden im CarBuilder übertragen.
	 */
	Car() {

	}

	/**
	 * Die Werte das Carbuilder in das Car übertragen
	 */
	Car(CarBuilder carBuilder) {
		this.setCarBody(carBuilder.getCarBody());
		this.setColor(carBuilder.getColor());
		this.setMotor(carBuilder.getMotor());
		this.setTires(carBuilder.getTires());
	}

	@Override
	public String toString() {
		return "Car [carBody=" + carBody + ", color=" + color + ", motor=" + motor + ", tires=" + tires + "]";
	}

}

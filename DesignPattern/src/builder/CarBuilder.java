package builder;

public class CarBuilder {

	private CarBody carBody;// null
	private Color color;// null
	private Motor motor;// null
	private Tires tires;// null

	public CarBody getCarBody() {
		if (this.carBody == null) {
			this.carBody = CarBody.COMPACT;
		}
		return carBody;
	}

	public Color getColor() {
		if (this.color == null) {
			this.color = Color.BLACK;
		}
		return color;
	}

	public Motor getMotor() {
		if (this.motor == null) {
			this.motor = Motor.SMALLBLOCK;
		}
		return motor;
	}

	public Tires getTires() {
		if(this.tires == null) {
			this.tires = Tires.SUMMER;
		}
		return tires;
	}

	public CarBuilder withCarBody(CarBody carBody) {
		this.carBody = carBody;
		return this;
	}

	public CarBuilder withColor(Color color) {
		this.color = color;
		return this;
	}

	public CarBuilder withMotor(Motor motor) {
		this.motor = motor;
		return this;
	}

	public CarBuilder withTires(Tires tires) {
		this.tires = tires;
		return this;
	}

	/**
	 * Variante I
	 * 
	 * Alle Werte werden in der Build Methode in das Car Objekt geschrieben.
	 * 
	 * In dieser Variante könnten die Getter private bleiben.
	 */
//	public Car build01() {
//		Car car = new Car();
//		car.setCarBody(this.getCarBody());
//		car.setColor(this.getColor());
//		car.setMotor(this.getMotor());
//		car.setTires(this.getTires());
//		return car;
//	}

	/**
	 * Variante II
	 * 
	 * Alle Werte werden im Konstruktor der Car Klasse übertragen.
	 * 
	 * In dieser Variante müssem die Getter public sein
	 */
//	public Car build02() {
//		return new Car(this);
//	}

	public Car build() {
		return new Car(this);
	}
	
}

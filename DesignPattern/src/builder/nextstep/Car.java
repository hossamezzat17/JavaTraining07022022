package builder.nextstep;

public class Car {
	
//	Innere Klassse - Nested Class 
//	public static class Builder {
//	Car.Builder cb = new Car().new Builder();

	
//	Innere Statische Klasse -  static Nested Class
//	public static class Builder {
//	Car.Builder cb = new Car.Builder();

	public static class Builder {

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

		public Builder withCarBody(CarBody carBody) {
			this.carBody = carBody;
			return this;
		}

		public Builder withColor(Color color) {
			this.color = color;
			return this;
		}

		public Builder withMotor(Motor motor) {
			this.motor = motor;
			return this;
		}

		public Builder withTires(Tires tires) {
			this.tires = tires;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
		
	}
	
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
	private Car() {

	}
	
	private Car(CarBody carBody, Color color, Motor motor, Tires tires) {
		super();
		this.carBody = carBody;
		this.color = color;
		this.motor = motor;
		this.tires = tires;
	}

	/**
	 * Die Werte das Carbuilder in das Car übertragen
	 */
	private Car(Builder builder) {
		this.setCarBody(builder.getCarBody());
		this.setColor(builder.getColor());
		this.setMotor(builder.getMotor());
		this.setTires(builder.getTires());
	}

	@Override
	public String toString() {
		return "Car [carBody=" + carBody + ", color=" + color + ", motor=" + motor + ", tires=" + tires + "]";
	}

}

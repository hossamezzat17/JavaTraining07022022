package builder.nextstep;

public class Application {

	public static void main(String[] args) {
//		Innere Klasse
//		new Car().new Builder();
//		Car.Builder cb = new Car().new Builder();
//		Car c01 = new Car();

//		Innere Statische Klasse
		Car.Builder cb = new Car.Builder();

		cb.withCarBody(CarBody.STATION_WAGON);
		System.out.println(cb.build());
		cb.withColor(Color.WHITE);
		System.out.println(cb.build());
		cb.withMotor(Motor.MEDIUMBLOCK).withTires(Tires.OFFROAD);
		System.out.println(cb.build());

	}

}

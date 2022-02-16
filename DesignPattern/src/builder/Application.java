package builder;

public class Application {

	public static void main(String[] args) {
		CarBuilder cb = new CarBuilder().withColor(Color.BLACK).withTires(Tires.ALLSEASON);
		
		System.out.println(cb.withMotor(Motor.SMALLBLOCK).build());
		System.out.println(cb.withCarBody(CarBody.CABRIO).build());
		System.out.println(cb.withTires(Tires.OFFROAD).withMotor(Motor.BIGBLOCK).build());
		System.out.println(cb.withColor(Color.PINK).build());
		System.out.println(cb.build());
		cb.withTires(Tires.SLICK).withColor(Color.CAMOUFLAGE).withCarBody(CarBody.LIMOUSINE);
		System.out.println(cb.build());
	}

}

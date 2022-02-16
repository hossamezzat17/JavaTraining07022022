package builder;

import javax.swing.text.DefaultEditorKit.InsertContentAction;

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

		Car c01 = new Car(CarBody.CABRIO, Color.BLACK, Motor.SMALLBLOCK, Tires.SUMMER);
		Car c02 = new Car(CarBody.CABRIO, Color.BLACK, Motor.SMALLBLOCK, Tires.OFFROAD);
		Car c03 = new Car(CarBody.CABRIO, Color.BLACK, Motor.SMALLBLOCK, Tires.SLICK);
		Car c04 = new Car(CarBody.CABRIO, Color.BLACK, Motor.SMALLBLOCK, Tires.ALLSEASON);
		Car c05 = new Car(CarBody.CABRIO, Color.BLACK, Motor.SMALLBLOCK, Tires.OFFROAD);

		CarBuilder cabrioBuilder = new CarBuilder().withCarBody(CarBody.CABRIO).withColor(Color.BLACK)
				.withMotor(Motor.SMALLBLOCK);
		Car carbrio01 = cabrioBuilder.withTires(Tires.SUMMER).build();
		Car carbrio02 = cabrioBuilder.withTires(Tires.OFFROAD).build();
		Car carbrio03 = cabrioBuilder.withTires(Tires.SLICK).build();
		Car carbrio04 = cabrioBuilder.withTires(Tires.ALLSEASON).build();
		Car carbrio05 = cabrioBuilder.withTires(Tires.OFFROAD).build();

		System.out.println(c01);
		System.out.println(c02);
		System.out.println(c03);
		System.out.println(c04);
		System.out.println(c05);
		System.out.println(carbrio01);
		System.out.println(carbrio02);
		System.out.println(carbrio03);
		System.out.println(carbrio04);
		System.out.println(carbrio05);
	}

}

package gen02;

public class Application {

	public static void main(String[] args) {
		Punkt<Integer> p01 = new Punkt<>();
		
		p01.setX(12345);
		p01.setY(12345);
		
		Punkt<Float> p02 = new Punkt<>();
		p02.setX(123F);
		p02.setY(321F);
		
		Punkt<String> p03 = new Punkt<>();
		p03.setX("123F Hallo Welt");
		p03.setY("321F Hallo Welt");
		
		System.out.println(p01.getX());//Integer gen02.Punkt.getX()
		System.out.println(p02.getX());//Float gen02.Punkt.getX()
		System.out.println(p03.getX());//String gen02.Punkt.getX()
	}

}

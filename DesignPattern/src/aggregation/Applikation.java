package aggregation;

public class Applikation {

	public static void main(String[] args) {
		Stuhl stuhl = new Stuhl();
		
		Restaurant r = new Restaurant();
		
		r.addStuhl(stuhl);
		
		System.out.println(stuhl);
		
		System.out.println(r.getStuhl());
	}
}

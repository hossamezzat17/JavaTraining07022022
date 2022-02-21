package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<Stuhl> stuehle = new ArrayList<>();

	public List<Stuhl> getStuehle() {
		return stuehle;
	}

	public void setStuehle(List<Stuhl> stuehle) {
		this.stuehle = stuehle;
	}

	public void addStuhl(Stuhl stuhl) {
		stuehle.add(stuhl);
	}
	
	public Stuhl getStuhl() {
		return stuehle.get(0);
	}
	
}

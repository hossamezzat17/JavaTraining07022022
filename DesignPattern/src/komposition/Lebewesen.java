package komposition;

import java.util.ArrayList;
import java.util.List;

public class Lebewesen {

	private List<Bein> beine;
	private List<Arm> arme;

	public List<Bein> getBeine() {
		List<Bein> copy = new ArrayList<>();
		for (Bein origin : beine) {
			copy.add(new Bein(origin));
		}
		return copy;
	}

	private void setBeine(List<Bein> beine) {
		this.beine = beine;
	}

	private List<Arm> getArme() {
		return arme;
	}

	private void setArme(List<Arm> arme) {
		this.arme = arme;
	}

	public Lebewesen() {
		this.setArme(new ArrayList<Arm>());
		this.setBeine(new ArrayList<Bein>());
	}
	
	public void addArm() {
		this.getArme().add(new Arm());
	}
	
	public void addBein(int laenge) {
		this.beine.add(new Bein(laenge));
	}
	
	public Bein getBein() {
		return this.beine.get(0).copy();
	}
	
	public void zeigeBeine() {
		for (Bein bein: beine) {
			System.out.println(bein);
		}
	}
}

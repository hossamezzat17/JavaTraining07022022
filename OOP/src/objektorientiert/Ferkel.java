package objektorientiert;

public class Ferkel extends Schwein{

	private String fellfarbe;

	public String getFellfarbe() {
		return fellfarbe;
	}

	public void setFellfarbe(String fellfarbe) {
		this.fellfarbe = fellfarbe;
	}
	
	public Ferkel() {
		this("Ruessel",1,15,"Hellbraun");
	}
	
	public Ferkel(String name, int alter,int gewicht,String fellfarbe) {
		super(name,alter,gewicht);
		this.setFellfarbe(fellfarbe);
	}

	@Override
	public String toString() {
		return "Ferkel [getFellfarbe()=" + getFellfarbe() + ", getName()=" + getName() + ", getAlter()=" + getAlter()
				+ ", getGewicht()=" + getGewicht() + "]";
	}

	public void rumTollen() {
		System.out.println("Quuuiiiiiickk");
		System.out.println("Rennt wie wild durch den Stall");
		this.setGewicht(this.getGewicht() - 4);
	}

	
	
}

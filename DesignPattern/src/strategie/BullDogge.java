package strategie;

public class BullDogge extends Hund {

	
	public BullDogge() {
		this.setBellVerhalten(new Knurren());
		this.setLaufVerhalten(new Humpeln());
	}
}

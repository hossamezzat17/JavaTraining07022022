package strategie;

public class Knurren implements BellVerhalten{

	@Override
	public void bellen() {
		System.out.println(this.getClass().getSimpleName() + ": Grrrgggrrrrr Knurrr");
	}

}

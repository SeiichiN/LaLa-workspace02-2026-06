package monsters;

public class DeathBat extends FlyingMonster {

	public DeathBat(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("突っつく");
	}

}

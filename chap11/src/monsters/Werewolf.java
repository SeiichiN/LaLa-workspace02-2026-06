package monsters;

public class Werewolf extends WalkingMonster {

	public Werewolf(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("かみつく");
	}

}

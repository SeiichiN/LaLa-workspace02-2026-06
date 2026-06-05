package monsters;

public class Main {

	public static void main(String[] args) {
		Goblin g = new Goblin("ゴブリン");
		g.attack();
		g.run();
		
		Werewolf w = new Werewolf("ワーウルフ");
		w.attack();
		w.run();
		
		DeathBat db = new DeathBat("地獄コウモリ");
		db.attack();
		db.run();

	}

}

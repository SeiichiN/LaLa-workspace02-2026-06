package monsters;

public abstract class Monster {
	String name;
	int hp;
	int mp;
	
	public Monster(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}
	
	public abstract void attack();
	
	public abstract void run();
}

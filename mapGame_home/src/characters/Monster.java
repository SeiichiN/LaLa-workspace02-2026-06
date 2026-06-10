package characters;

import main.Player;

public abstract class Monster {
	private String name;
	private int hp;
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public abstract void attack(Player p);

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	
}

package items;

public class Potion extends Item {
	private int hp;
	
	public Potion() {
		super("ポーション");
		this.hp = 100;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}

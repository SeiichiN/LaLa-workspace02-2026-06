package main;

public abstract class Character {
	private String name;
	private int hp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}

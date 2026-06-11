package rensyu;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;
	
	// public Hero(String name) {
	// 	this.name = name;
	// }
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			  ("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
			  ("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
			  ("名前が長過ぎる。処理を中断");
		}
		
	 	this.name = name;
	}
	
	public void attack(Matango m) {
		System.out.println("おばけキノコからの反撃");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println
		  (this.name + "は眠って回復した");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}
	

}

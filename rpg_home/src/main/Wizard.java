package main;

import java.util.Random;

public class Wizard extends Human {
	private int mp;

	public Wizard(String name) {
		super(name, 100);
		this.mp = 50;
	}

	@Override
	public void attack(Monster m) {
		System.out.println
		  (this.getName() + "は" + m.getName() + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (m.getName() + "に" + damage + "ポイントのダメージを与えた");
		m.setHp(m.getHp() - damage);
	}

	public void fireball(Monster m) {
		System.out.println(this.getName() + "は火の玉を放った");
		int damage = 20;
		System.out.println
		  (m.getName() + "に20ポイントのダメージを与えた");
		this.setHp(this.getMp() - 5);
	}
	
	public int getMp() {
		return mp;
	}	
	
	public void setMp(int mp) {
		this.mp = mp;
	}	
}

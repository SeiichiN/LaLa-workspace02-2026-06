package main;

import java.util.Random;

public class Wizard extends Human {
	int mp;

	public Wizard(String name) {
		super(name, 100);
		this.mp = 50;
	}

	@Override
	public void attack(Monster m) {
		System.out.println
		  (this.name + "は" + m.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (m.name + "に" + damage + "ポイントのダメージを与えた");
		m.hp -= damage;
	}

	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った");
		int damage = 20;
		System.out.println
		  (m.name + "に20ポイントのダメージを与えた");
		mp -= 5;
	}
}

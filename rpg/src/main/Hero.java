package main;

import java.util.Random;

public class Hero extends Human {
	
	public Hero(String name) {
		super(name, 100);
	}
	
	public void attack(Monster m) {
		if (this.getHp() <= 0) { return; }
		System.out.println
		  (this.getName() + "は" + m.getName() + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (m.getName() + "に" + damage + "ポイントのダメージを与えた");
		m.setHp(m.getHp() - damage);
	}
}

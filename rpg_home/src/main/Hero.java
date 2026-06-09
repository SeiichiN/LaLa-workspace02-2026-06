package main;

import java.util.Random;

public class Hero extends Human {
	
	public Hero(String name) {
		super(name, 100);
	}
	
	public void attack(Monster g) {
		System.out.println
		  (this.getName() + "は" + g.getName() + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (g.getName() + "に" + damage + "ポイントのダメージを与えた");
		g.setHp(g.getHp() - damage);
	}
}

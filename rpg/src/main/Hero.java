package main;

import java.util.Random;

public class Hero extends Human {
	
	public Hero(String name) {
		super(name, 100);
	}
	
	public void attack(Monster g) {
		System.out.println
		  (this.name + "は" + g.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (g.name + "に" + damage + "ポイントのダメージを与えた");
		g.hp -= damage;
	}
}

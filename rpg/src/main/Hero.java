package main;

import java.util.Random;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public void attack(Goblin g) {
		System.out.println
		  (this.name + "は" + g.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (g.name + "に" + damage + "ポイントのダメージを与えた");
		g.hp -= damage;
	}
}

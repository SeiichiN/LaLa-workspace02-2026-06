package main;

import java.util.Random;

public class Hero extends Human {
	
	public Hero(String name) {
		super(name, 100);
	}
	
	public void attack(Monster m) {
		System.out.println
		  (this.name + "は" + m.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (m.name + "に" + damage + "ポイントのダメージを与えた");
		m.hp -= damage;
	}
}

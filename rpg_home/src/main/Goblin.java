package main;

import java.util.Random;

public class Goblin {
	String name;
	int hp;
	
	public Goblin() {
		this.name = "ゴブリン"; 
		this.hp = 100;
	}

	public void attack(Hero h) {
		if (this.hp <= 0) {
			return;
		}
		System.out.println
		  (this.name + "は" + h.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (h.name + "に" + damage + "ポイントのダメージを与えた");
		h.hp -= damage;
	}
	
}

package main;

import java.util.Random;

public class Goblin extends Monster {
	
	public Goblin() {
		super("ゴブリン", 100);
	}

	public void attack(Human h) {
		System.out.println
		  (this.name + "は" + h.name + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (h.name + "に" + damage + "ポイントのダメージを与えた");
		h.hp -= damage;
	}
	
}

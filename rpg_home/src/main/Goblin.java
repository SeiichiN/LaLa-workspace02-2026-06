package main;

import java.util.Random;

public class Goblin extends Monster {
	
	public Goblin() {
		super("ゴブリン", 100);
	}

	public void attack(Human h) {
		System.out.println
		  (this.getName() + "は" + h.getName() + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (h.getName() + "に" + damage + "ポイントのダメージを与えた");
		h.setHp(h.getHp() - damage); // h.hp - damage;
	}
	
}

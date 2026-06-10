package characters;

import java.util.Random;

import main.Player;

public class Goblin extends Monster {
	
	public Goblin() {
		super("ゴブリン", 100);
	}

	public void attack(Player p) {
		if (this.getHp() <= 0) {
			return;
		}
		System.out.println
		  (this.getName() + "はプレイヤーを攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  ("プレイヤーに" + damage + "ポイントのダメージを与えた");
		p.setHp(p.getHp() - damage); // h.hp - damage;
	}
	
}

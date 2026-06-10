package main;

import java.util.List;
import java.util.Random;

import characters.Monster;
import items.Item;

public class Player {
	private int x;
	private int y;
	private int hp;
	private List<Item> inventory;
	
	public Player() {
		this.hp = 100;
		Random rnd = new Random();
		this.y = rnd.nextInt(5);
		this.x = rnd.nextInt(5);
		this.inventory = new java.util.ArrayList<>();
	}
	
	public void move () {
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new java.util.Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { this.y--; }
		case "s" -> { this.y++; }
		case "a" -> { this.x--; }
		case "d" -> { this.x++; }
		}
	}

	public void look(String[][] map) {
		System.out.print("[" + this.y + ":" + this.x + "] ");
		String ch = map[this.y][this.x];
		String msg = switch (ch) {
		case "s" -> "スライムが現れた！";
		case "g" -> "ゴブリンが現れた！";
		case "e" -> "エーテルがあった！";
		case "p" -> "ポーションを見つけた！";
		default -> "何も見当たらない…";
		};
		System.out.println(msg);
		switch (ch) {
		case "s", "g" -> {
			Battle b = new Battle(this, map);
			b.selectFight(ch);
		}
		case "p", "e" -> {
			UseItem ui = new UseItem(this, map);
			ui.takeItem(ch);
			// ui.selectItem(ch);
		}
		}
	}
	
	public void attack(Monster m) {
		if (this.hp <= 0) {
			return;
		}
		System.out.println
		  ("プレイヤーは" + m.getName() + "を攻撃した");
		int damage = new Random().nextInt(30);
		System.out.println
		  (m.getName() + "に" + damage + "ポイントのダメージを与えた");
		m.setHp(m.getHp() - damage); // h.hp - damage;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public List<Item> getInventory() {
		return inventory;
	}
	

}

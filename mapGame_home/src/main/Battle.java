package main;

import java.util.Scanner;

import characters.Goblin;
import characters.Monster;
import characters.Slime;

public class Battle {
	public final Scanner SC = new Scanner(System.in);
	private Player p;
	private String[][] map;
	
	public Battle(Player p, String[][] map) {
		this.p = p;
		this.map = map;
	}
	
	public void selectFight(String ch) {
		String str = null;
		do {
			System.out.print("a:戦う e:逃げる > ");
			str = SC.nextLine();
			switch (str) {
			case "a" -> {
				selectMonster(ch);
			}
			case "e" -> {
				System.out.println("逃げた");
			}
			default -> {
				System.out.println("選択してください");
			}
			}
		} while (!str.equals("a") && !str.equals("e"));			
	}	
	
	private void selectMonster(String ch) {
		switch (ch) {
		case "g" -> {
			Goblin g = new Goblin();
			fight(g);
		}
		case "s" -> {
			Slime s = new Slime();
			fight(s);
		}
		default -> {
			System.out.println("選択してください");
		}
		}
		
	}

	private void fight(Monster m) {
		while (p.getHp() > 0 && m.getHp() > 0) {
			p.attack(m);
			m.attack(p);
			System.out.println
			  ("プレイヤー:" + p.getHp() + " " + m.getName() + ":" + m.getHp() + "<Enter>");
			String s = SC.nextLine();
		}
		if (p.getHp() <= 0) {
			System.out.println("プレイヤーは死んでしまった");
		}
		if (m.getHp() <= 0) {
			System.out.println("プレイヤーは" + m.getName() + "を倒した");
			map[p.getY()][p.getX()] = ".";
		}
	}

}

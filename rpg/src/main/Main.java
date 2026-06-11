package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		Goblin g = new Goblin();
		while (h.getHp() > 0 && g.getHp() > 0) {
			h.attack(g);
			g.attack(h);
			System.out.println
			  (h.getName() + ":" + h.getHp() + " " + 
			   g.getName() + ":" + g.getHp() + " <Enter>");
			String s = new Scanner(System.in).nextLine();
		}
		if (g.getHp() <= 0) {
			System.out.println
			  (h.getName() + "は" + g.getName() + "を倒した");
		}
		if (h.getHp() <= 0) {
			System.out.println(h.getName() + "は倒れた");
		}
		System.out.println("ゲームオーバー");
	}

}

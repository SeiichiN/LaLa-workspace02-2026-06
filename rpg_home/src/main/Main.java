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
			  ("ヒーロー:" + h.getHp() + " ゴブリン:" + g.getHp() + "<Enter>");
			String s = new Scanner(System.in).nextLine();
		}
	}

}

package main;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		Goblin g = new Goblin();
		while (h.hp > 0 && g.hp > 0) {
			h.attack(g);
			g.attack(h);
			System.out.println
			  ("ヒーロー:" + h.hp + " ゴブリン:" + g.hp + " <Enter>");
			String dummy = new java.util.Scanner(System.in).nextLine();
		}
	}

}

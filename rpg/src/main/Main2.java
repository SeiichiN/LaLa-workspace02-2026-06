package main;

public class Main2 {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		Goblin g = new Goblin();
		h.attack(g);
		g.attack(h);
		
	}

}

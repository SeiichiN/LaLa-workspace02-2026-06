package main;

public class Main2 {

	public static void main(String[] args) {
		Human h = new Wizard("アサカ");
		Goblin g = new Goblin();
		h.attack(g);
		g.attack(h);
		// もしhがwizardならば、fireball()を実行
		if (h instanceof Wizard w) {
			w.fireball(g);
		}
	}

}

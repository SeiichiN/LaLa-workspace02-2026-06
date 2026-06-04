package main;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.suffix = 'A';
		// Hero h = new Hero();
		// h.attack(m);
		// m.run();
		SuperHero sh = new SuperHero();
		sh.fly();
		sh.attack(m);
	}

}

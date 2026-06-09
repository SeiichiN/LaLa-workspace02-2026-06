package p444;

public class Main {

	public static void main(String[] args) {
		
		Matango m = new Matango();
		Character c = new Wizard();
		if (c instanceof Wizard w) {
			w.name = "アサカ";
			w.attack(m);
			w.fireball(m);
			w.run();
		}
	}

}

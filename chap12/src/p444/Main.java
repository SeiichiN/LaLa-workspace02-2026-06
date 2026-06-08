package p444;

public class Main {

	public static void main(String[] args) {
		
		Character c = new Wizard();
		Hero h = (Hero) c;
		Matango m = new Matango();
		h.name = "アサカ";
		h.attack(m);
		// h.fireball(m);
		h.run();
	}

}

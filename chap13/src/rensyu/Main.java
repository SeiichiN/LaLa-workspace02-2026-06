package rensyu;

public class Main {

	public static void main(String[] args) {
		Wand wand = new Wand();
		String name = "魔法の杖";
		wand.setName(name);
		wand = null;
		Wizard w = new Wizard(wand);
		
	}

}

package main;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		String name = "ミなさんお元気ですか";
		h.setName(name);
		King k = new King();
		k.talk(h);

	}

}

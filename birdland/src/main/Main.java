package main;

public class Main {

	public static void main(String[] args) {
		Magamo magamo = new Magamo("マガモ");
		magamo.fly();
		Aigamo aigamo = new Aigamo("合鴨");
		aigamo.swim();
		Ahiru ahiru = new Ahiru("アヒル");
		ahiru.say();
		RubberDuck duck = new RubberDuck("ラバーダック");
		duck.swim();
		duck.say();
	}

}

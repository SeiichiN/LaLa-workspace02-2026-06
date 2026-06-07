package main;

public class RubbarDuck extends SwimToy {

	public RubbarDuck(String name) {
		super(name);
	}

	public void say() {
		System.out.println(this.name + "はキュッキュッと鳴く");
	}
	
	public void swim() {
		System.out.println(this.name + "はプカプカと浮かぶ");
	}
}

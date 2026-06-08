package main;

public class RubberDuck extends SwimToy {

	public RubberDuck(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "はプカプカ浮く");
	}
	
	public void say() {
		System.out.println(this.name + "はキュッキュッと鳴く");
	}
}

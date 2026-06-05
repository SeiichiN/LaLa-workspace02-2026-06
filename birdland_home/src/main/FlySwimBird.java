package main;

public abstract class FlySwimBird extends Bird implements Swimming, Flying {

	public FlySwimBird(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + "はバサバサと飛ぶ");
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + "はスイスと泳ぐ");
	}
}

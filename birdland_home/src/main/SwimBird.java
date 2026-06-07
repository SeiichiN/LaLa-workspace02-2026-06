package main;

public abstract class SwimBird extends Bird implements Swimming {
	
	public SwimBird(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスと泳ぐ");
	}	
}

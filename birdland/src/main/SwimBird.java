package main;

public abstract class SwimBird extends Bird 
                            implements Swimming {

	public SwimBird(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
}

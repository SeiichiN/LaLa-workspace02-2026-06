package main;

public class Aigamo extends SwimBird {
	public Aigamo(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.name + "はガアガアと鳴く");			
	}

}

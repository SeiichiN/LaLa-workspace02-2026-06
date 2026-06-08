package main;

public abstract class FlySwimBird extends Bird 
                  implements Flying, Swimming {

	public FlySwimBird(String name) {
		          super(name);
	}
	
	public void fly() {
		System.out.println(this.name + "はバサバサと飛ぶ");
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイと泳ぐ");
	}

}

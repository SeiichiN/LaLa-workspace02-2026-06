package main;

public class Character {
	String name;
	int hp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}

package main;

public abstract class Human extends Character {

	public Human(String name, int hp) {
		super(name, hp);
	}
	
	public abstract void attack(Monster m);

}

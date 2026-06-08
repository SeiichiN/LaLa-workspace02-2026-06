package main;

public abstract class Monster extends Character {
	public Monster(String name, int hp) {
		super(name, hp);
	}
	
	public abstract void attack(Human c);
}

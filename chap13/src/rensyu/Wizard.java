package rensyu;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(Wand wand) {
		this.setWand(wand);
	}
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = 
			(int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		  (h.getName() + "のHPを" + recovPoint + "回復した");
	}
	
	public int getHp() { return this.hp; }
	public int getMp() { return this.mp; }
	public String getName() { return this.name; }
	public Wand getWand() { return this.wand; }
	
	public void setHp(int hp) {
		if (hp < 0) { hp = 0; }
		this.hp = hp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			  ("MPは0以上です");
		}
		this.mp = mp;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
			  ("名前は必ず３文字以上です");
		}
		this.name = name;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException
			  ("杖は必ず装着してください");
		}
		this.wand = wand;
	}
	
}

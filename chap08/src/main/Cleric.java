package main;

public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;;
	final int MAX_MP = 10;
	
	public int pray(int sec) {
		System.out.println
		  (this.name + "は" + sec + "秒祈った！");
		int hosei = new java.util.Random().nextInt(3);
		int kaifuku = sec + hosei;
		int newMp = this.mp + kaifuku;
		if (newMp > MAX_MP) {
			newMp = MAX_MP;
		}
		int jissai = newMp - this.mp;
		this.mp = newMp;
		System.out.println("MPが" + this.mp + "に回復した");
		return jissai;
	}

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println
		  (this.name + "はセルフエイドという魔法を使った");
		System.out.println("MPを5消費した");
		System.out.println("HPが最大HPに回復した");
	}
}

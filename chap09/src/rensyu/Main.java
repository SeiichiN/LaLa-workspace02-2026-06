package rensyu;

public class Main {
	
	public static void heal(int hp) {
		hp += 10;
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		heal(baseHp);  
		// baseHpの値がコピーされてheal()に渡されている
		System.out.println(baseHp + " : " + t.hp);
		heal(t);
		// Thiefインスタンスへの参照がheal()に渡されている
		System.out.println(baseHp + " : " + t.hp);
	}

}

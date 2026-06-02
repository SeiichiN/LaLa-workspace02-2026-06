package main;

public class Rensyu {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "アサカ";
		c.selfAid();
		c.selfAid();
		int recov = c.pray(5);
		System.out.println("実際の回復量は" + recov);
	}
	
}

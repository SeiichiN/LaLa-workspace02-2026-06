package main;

public class Player {
	int x;
	int y;
	
	public void move () {
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new java.util.Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { this.y--; }
		case "s" -> { this.y++; }
		case "a" -> { this.x--; }
		case "d" -> { this.x++; }
		}
	}

	public void look(String[][] map) {
		System.out.print("現在位置 [" + this.y + ":" + this.x + "] ");
		System.out.println(map[this.y][this.x]);
	}
	

}

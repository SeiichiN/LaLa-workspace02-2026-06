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
		System.out.print("[" + this.y + ":" + this.x + "] ");
		String msg = switch (map[this.y][this.x]) {
		case "s" -> "スライムが現れた！";
		case "g" -> "ゴブリンが現れた！";
		case "e" -> "エーテルがあった！";
		case "p" -> "ポーションを見つけた！";
		default -> "何も見当たらない…";
		};
		System.out.println(msg);
	}
	

}

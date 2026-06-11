package main;

import java.util.Random;
import java.util.Scanner;

public class Player {
	private int y;  // 縦
	private int x;  // 横
	
	public Player() {
		Random rnd = new Random();
		this.y = rnd.nextInt(5);
		this.x = rnd.nextInt(5);
	}
	
	public void look(String[][] map) {
		System.out.print("現在位置 [" + this.y + ":" + this.x + "] ");
		System.out.println(map[this.y][this.x]);
	}
	
	public void move() {
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { this.y--; }
		case "s" -> { this.y++; }
		case "a" -> { this.x--; }
		case "d" -> { this.x++; }
		}
	}


}

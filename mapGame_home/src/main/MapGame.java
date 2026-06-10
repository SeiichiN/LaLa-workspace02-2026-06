package main;

import java.util.Random;

public class MapGame {
	
	public static void printMap(Player p, String[][] map) {
		for (int y = 0; y < 5; y++) {
			System.out.print("|");
			for (int x = 0; x < 5; x++) {
				if (p.getY() == y && p.getX() == x) {
					System.out.print("A");
				} else {
					System.out.print(map[y][x]);
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String[][] map = {
				{".", "p", ".", ".", "."},	
				{".", ".", ".", "g", "."},	
				{".", ".", ".", ".", "."},	
				{".", "s", ".", ".", "."},	
				{".", ".", "e", ".", "."},	
		};
		Player player = new Player();
		printMap(player, map);
		player.look(map);
		
		while(true) {
			player.move();
			printMap(player, map);
			player.look(map);
			if (player.getHp() <= 0) {
				System.out.println("ゲームオーバー");
				break;
			}
		}

	}

}

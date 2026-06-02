package main;

public class MapGame {
	
	public static void main(String[] args) {
		String[][] map = {
				{".", "p", ".", ".", "."},	
				{".", ".", ".", "g", "."},	
				{".", ".", ".", ".", "."},	
				{".", "s", ".", ".", "."},	
				{".", ".", "e", ".", "."},	
		};
		Player player = new Player();
		player.y = 3;
		player.x = 1;
		player.look(map);
		
		while(true) {
			player.move();
			player.look(map);
			
		}

	}

}

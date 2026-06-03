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
		Player p = new Player();
		p.look(map);
				
		while(true) {
			p.move();
			p.look(map);
			
		}

	}

}

package main;

import java.util.Scanner;

import items.Ether;
import items.Item;
import items.Potion;

public class UseItem {
	private Scanner SC = new Scanner(System.in);
	private Player p;
	private String[][] map;
	public UseItem(Player p, String[][] map) {
		this.p = p;
		this.map = map;
	}
	
	public void takeItem(String ch) {
		System.out.print("アイテムを取りますか？ y/n > ");
		String str = SC.nextLine();
		Item item = null;
		if (str.equals("y")) {
			switch (ch) {
			case "p" -> item = new Potion();
			case "e" -> item = new Ether();
			}
			takeItem(item);
		}
	}
	
	private void takeItem(Item item) {
		p.getInventory().add(item);
		System.out.println("持ち物に" + item.getName() + "を追加しました");
		map[p.getY()][p.getX()] = ".";
	}
	
	public void selectItem(String ch) {
		System.out.print("使用するアイテムを選択してください");
		switch (ch) {
		// case "p" -> usePotion();
		// case "e" -> p.useEther();
		}
	}
}

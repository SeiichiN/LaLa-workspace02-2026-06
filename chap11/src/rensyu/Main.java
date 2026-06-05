package rensyu;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("いやいやえん", 1500, "白", "1234");
		String title = book.getName();
		int price = book.getPrice();
		System.out.println("この本のタイトルは『" + title + "』です。");
		System.out.println("値段は" + price + "円です。");
	}

}

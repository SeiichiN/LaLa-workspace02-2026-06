package items;

public class Ether extends Item {
	private int mp;
	
	public Ether() {
		super("エーテル");
		this.mp = 50;
	}

	public int getHp() {
		return mp;
	}

	public void setHp(int mp) {
		this.mp = mp;
	}

}

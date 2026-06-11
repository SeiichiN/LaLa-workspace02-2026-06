package rensyu;

public class Wand {
	private String name;
	private double power;
	
	public String getName() { return this.name; }
	public double getPower() { return this.power; }
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
			  ("杖の名前は３文字以上です");
		}
		this.name = name;
	}
	public void setPower(double power) {
		if (power < 0.05 || power > 10) {
			throw new IllegalArgumentException
			  ("杖の魔力は0.05以上10以下です");
		}
		this.power = power;
	}
}

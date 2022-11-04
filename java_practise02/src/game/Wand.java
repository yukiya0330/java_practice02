package game;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("3文字以上で設定してください");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}

}

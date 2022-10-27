package game;

public class Cleric {
	String name;
	int hp = 50;
	int MaxHp = 50;
	int mp = 10;
	int MaxMp = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = MaxHp;
	}

	public void pray(int sec) {
		this.mp += sec + Math.random();
	}
}

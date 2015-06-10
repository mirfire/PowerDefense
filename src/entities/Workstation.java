package entities;

public class Workstation {
	private int maxHp = 100;
	private int life = 100;
	
	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public void repair(int life, int ressources){
		return;
	}
}

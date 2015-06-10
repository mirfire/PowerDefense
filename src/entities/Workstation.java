package entities;

public class Workstation {
	private int maxHp = 100;
	private int life = 100;
	
	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int i) {
		this.maxHp = i;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int i) {
		this.life = i;
	}


	public void repair(int life, int ressources){
		return;
	}
}
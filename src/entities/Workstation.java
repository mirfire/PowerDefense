package entities;

public class Workstation {
	private static int maxHp = 100;
	private static int life = 100;
	
	public static int getlife() {
		return life;
	}

	public static void setlife(int i) {
		life = i;
	}
	public void repair(int life, int ressources){
		return;
	}

	public static int getMaxHp() {
		return maxHp;
	}

	public static void setMaxHp(int i) {
		maxHp = i;		
	}
}

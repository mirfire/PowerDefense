package game;

public class Game {
	private String gameName;
	//Map map = new Map();
	private int ressources;
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	
	public int getressources() {
		return ressources;
	}

	public void setressources(int Ressources) {
		this.ressources = Ressources;
	}

	
	
	public void decrementressources(int value) {
		this.ressources -= value;
	}
	public void incrementressources(int value) {
		this.ressources += value;
	}
	
	
}

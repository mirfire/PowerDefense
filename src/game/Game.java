package game;

import javax.swing.JPanel;

public class Game {
	private String gameName;
	private int resources;
	Map map;
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSurvivedTime() {
		return survivedTime;
	}

	public void setSurvivedTime(int survivedTime) {
		this.survivedTime = survivedTime;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public Game(String gameName, Map map) {
		this.resources = 300;
		this.map = map;
		this.setGameName(gameName);
		this.score = 0;
		this.survivedTime = 0;
		this.kills = 0;
		this.pause = false;
		
	}
	
	public int getRessources() {
		return resources;
	}

	public void setRessources(int i) {
		i = resources;
	}
	
	public void addResources(int i) {
		resources = resources + i;
	}

	public static void exitGame(int exitcode) {
		System.exit(exitcode);
	}
	
	public void startGame() {
		
	}
	
	public void renderGame(JPanel panelGame) {
		
	}

}

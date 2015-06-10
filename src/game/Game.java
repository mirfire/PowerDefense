package game;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Game {
	private String gameName;
	Map map = new Map();
	private static int ressources;
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	
	public Game(String gameName) {
		this.ressources = 300;
		this.gameName = gameName;
		this.score = 0;
		this.survivedTime = 0;
		this.kills = 0;
		this.pause = false;
	}
	
	public static int getRessources() {
		return ressources;
	}

	public static void setRessources(int i) {
		i = ressources;
	}

	public static void exitGame(int exitcode) {
		System.exit(exitcode);
	}
	
	public int pause(){
		return 1;
	}
	
	public void startGame() {
		
	}
	
	public void renderGame(JPanel panelGame) {
		
	}
}

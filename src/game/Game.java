package game;

import java.awt.Graphics;
import database.Save;
import entities.*;
import javax.swing.JPanel;

public class Game {
	private String gameName;
	private int ressources;
	Map map = new Map();
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	Game partie1 = new Game("partie une");
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public Game(String gameName) {
		this.ressources = 300;
		this.setGameName(gameName);
		this.score = 0;
		this.survivedTime = 0;
		this.kills = 0;
		this.pause = false;
	}
	
	public int getRessources() {
		return ressources;
	}

	public void setRessources(int i) {
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

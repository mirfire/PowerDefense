package game;


public class Game {
	Game game = new Game();
	private String gameName;
	//Map map = new Map();
	private int ressources;
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	
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
}

package game;

public class Game {
	private String gameName;
	//Map map = new Map();
	private static int ressources;
	private int score;
	private int survivedTime;	//a modifier
	private int kills;
	private boolean pause;
	
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
}

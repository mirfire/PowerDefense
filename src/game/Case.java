package game;

public class Case {
	private Coords coords;
	private boolean buildable;
	private String spritePath;
	
	public Case(int x, int y) {
		this.coords.setX(x);
		this.coords.setY(y);
	}
}

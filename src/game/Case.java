package game;

public class Case {
	private Coords coords;
	private boolean buildable;
	private String spritePath;
	
	public Case(int x, int y, String spritePath) {
		this.coords.setX(x);
		this.coords.setY(y);
		this.buildable = true;
		this.spritePath = spritePath;
	}

	public Coords getCoords() {
		return coords;
	}

	public void setCoords(Coords coords) {
		this.coords = coords;
	}

	public boolean isBuildable() {
		return buildable;
	}

	public void setBuildable(boolean buildable) {
		this.buildable = buildable;
	}

	public String getSpritePath() {
		return spritePath;
	}

	public void setSpritePath(String spritePath) {
		this.spritePath = spritePath;
	}
	
}

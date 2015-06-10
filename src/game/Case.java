package game;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Case {
	private Coords coords;
	private boolean buildable;
	private boolean monsterPath;
	private String spritePath;
	private Image sprite;
	
	public Case(int x, int y, String spritePath) {
		this.coords.setX(x);
		this.coords.setY(y);
		this.buildable = true;
		this.monsterPath = false;
		this.spritePath = spritePath;
		try {
			this.sprite = ImageIO.read(new File(this.spritePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
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

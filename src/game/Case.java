package game;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Case {
	protected Coords coords;
	protected boolean buildable;
	protected boolean monsterPath;
	protected String spritePath;
	protected Image sprite;
	
	public Case(int x, int y) {
		this.coords.setX(x);
		this.coords.setY(y);
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

	public boolean isMonsterPath() {
		return monsterPath;
	}

	public void setMonsterPath(boolean monsterPath) {
		this.monsterPath = monsterPath;
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
}

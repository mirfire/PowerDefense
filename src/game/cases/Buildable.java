package game.cases;

import game.Case;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Buildable extends Case {

	public Buildable(int x, int y) {
		super(x, y);
		this.buildable = true;
		this.monsterPath = false;
		this.spritePath = "resources/sprites/grass.png";
		try {
			this.sprite = ImageIO.read(new File(this.spritePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

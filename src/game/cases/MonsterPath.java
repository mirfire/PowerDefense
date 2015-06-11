package game.cases;

import game.Case;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MonsterPath extends Case {

	public MonsterPath(int x, int y) {
		super(x, y);
		this.buildable = false;
		this.monsterPath = true;
		this.spritePath = "resources/sprites/dirt.png";
		try {
			this.sprite = ImageIO.read(new File(this.spritePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

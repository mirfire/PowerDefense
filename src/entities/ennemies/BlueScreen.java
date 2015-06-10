package entities.ennemies;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlueScreen extends Ennemy {
	
	public BlueScreen(String name, int HP, int dmg, int walkSpeed,
			int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
	}
	Ennemy BlueScreen = new Ennemy("BlueScreen", 25, 10, 2, 6,"resistWeb", "resources/Ennemies/blueScreen.png");
	
	public void SpawnEnnemies(Graphics g){
		Image img1;
		try {
			img1 = ImageIO.read(new File("/resources/Ennemies/blueScreen.png"));
			g.drawImage(img1, 40 , 40 , null);	
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}

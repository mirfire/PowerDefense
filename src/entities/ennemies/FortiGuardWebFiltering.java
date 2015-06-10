package entities.ennemies;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class FortiGuardWebFiltering extends Ennemy {
	
	public FortiGuardWebFiltering(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy FortiGuardWebFiltering = new Ennemy("FortiGuardWebFiltering", 500, 25, 1, 50, "resistNormal","resources/Ennemies/fortiguard.png");
	
	public void SpawnEnnemies(Graphics g){
		Image img1;
		try {
			img1 = ImageIO.read(new File("/resources/Ennemies/fortiguard.png"));
			g.drawImage(img1, 40 , 40 , null);	
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}

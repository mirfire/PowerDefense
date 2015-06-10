package entities.ennemies;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class NullPointerAssigment extends Ennemy {
	public NullPointerAssigment(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy NullPointerAssigment = new Ennemy("NullPointerAssigment", 10, 3, 3, 2, "resistFile", "resources/Ennemies/4477.NullPointerException.png");
	
	public void SpawnEnnemies(Graphics g){
		Image img1;
		try {
			img1 = ImageIO.read(new File("/resources/Ennemies/4477.NullPointerException.png"));
			g.drawImage(img1, 40 , 40 , null);	
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}

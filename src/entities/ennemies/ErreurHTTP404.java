package entities.ennemies;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ErreurHTTP404 extends Ennemy {
	
	public ErreurHTTP404(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy ErreurHTTP404 = new Ennemy("ErreurHTTP404", 50, 15, 1, 4, "resistCode", "resources/Ennemies/404-page-not-found.png");
	
	public void SpawnEnnemies(Graphics g){
		Image img1;
		try {
			img1 = ImageIO.read(new File("/resources/Ennemies/404-page-not-found.png"));
			g.drawImage(img1, 40 , 40 , null);	
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}

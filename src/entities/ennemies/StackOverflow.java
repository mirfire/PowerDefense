package entities.ennemies;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import menus.InGameMenu;
import javax.imageio.ImageIO;

public class StackOverflow extends Ennemy{
	
	public StackOverflow(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy StackOverflow = new Ennemy("StackOverflow", 15, 5, 1, 1, "resistNetwork", "resources/Ennemies/Social-Networks-Stackoverflow-icon.png");
	
	public void SpawnEnnemies(Graphics g){
		Image img1;
		try {
			img1 = ImageIO.read(new File("/resources/Ennemies/Social-Networks-Stackoverflow-icon.png"));
			g.drawImage(img1, 40 , 40 , null);	
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
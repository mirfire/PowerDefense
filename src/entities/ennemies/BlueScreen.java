package entities.ennemies;

public class BlueScreen extends Ennemy {
	
	public BlueScreen(String name, int HP, int dmg, int walkSpeed,
			int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
	}
	Ennemy BlueScreen = new Ennemy("BlueScreen", 25, 10, 2, 6, "");
}

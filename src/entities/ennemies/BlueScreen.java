package entities.ennemies;

public class BlueScreen extends Ennemy {
	
	public BlueScreen(String name, int HP, int dmg, int walkSpeed,
			int droppedRessources,Resistances resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, resistances, spritePath);
	}
	Ennemy BlueScreen = new Ennemy("BlueScreen", 25, 10, 2, 6,Resistances.WEB, "");
}

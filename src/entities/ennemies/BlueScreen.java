package entities.ennemies;

public class BlueScreen extends Ennemy {
	public BlueScreen(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
		this.name = "BlueScreen";
		this.HP = 25;
		this.dmg = 10;
		this.walkSpeed = 2;
		this.resistances.setResistWeb(50);
		this.droppedRessources = 6;
		this.spritePath = "";
		}
}

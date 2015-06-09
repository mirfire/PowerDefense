package entities.ennemies;

public class StackOverflow extends Ennemy{
	
	public StackOverflow(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
		this.name = "StackOverflow";
		this.HP = 15;
		this.dmg = 5;
		this.walkSpeed = 1;
		this.resistances.setResistNetwork(50);
		this.droppedRessources = 1;
		this.spritePath = "";
		}
}

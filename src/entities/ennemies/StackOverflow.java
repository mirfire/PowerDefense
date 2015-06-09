package entities.ennemies;

public class StackOverflow extends Ennemy{
	
	public StackOverflow(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, Resistances resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, resistances, spritePath);
		}
	Ennemy StackOverflow = new Ennemy("StackOverflow", 15, 5, 1, 1, Resistances.NETWORK, "");
}

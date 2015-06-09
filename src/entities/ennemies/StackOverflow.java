package entities.ennemies;

public class StackOverflow extends Ennemy{
	
	public StackOverflow(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy StackOverflow = new Ennemy("StackOverflow", 15, 5, 1, 1, "resistNetwork", "");
}

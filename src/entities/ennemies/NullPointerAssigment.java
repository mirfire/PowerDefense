package entities.ennemies;

public class NullPointerAssigment extends Ennemy {
	public NullPointerAssigment(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy NullPointerAssigment = new Ennemy("NullPointerAssigment", 10, 3, 3, 2, "resistFile", "resources/Ennemies/4477.NullPointerException.png");
}

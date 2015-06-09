package entities.ennemies;

public class FortiGuardWebFiltering extends Ennemy {
	
	public FortiGuardWebFiltering(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, Resistances, spritePath);
		}
	Ennemy FortiGuardWebFiltering = new Ennemy("FortiGuardWebFiltering", 500, 25, 1, 50, "resistNormal","");
}

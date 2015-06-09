package entities.ennemies;

public class FortiGuardWebFiltering extends Ennemy {
	
	public FortiGuardWebFiltering(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, Resistances resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, resistances, spritePath);
		}
	Ennemy FortiGuardWebFiltering = new Ennemy("FortiGuardWebFiltering", 500, 25, 1, 50, Resistances.NORMAL,"");
}

package entities.ennemies;

public class ErreurHTTP404 extends Ennemy {
	
	public ErreurHTTP404(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, Resistances resistances, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, resistances, spritePath);
		}
	Ennemy ErreurHTTP404 = new Ennemy("ErreurHTTP404", 50, 15, 1, 4, Resistances.CODE, "");
}

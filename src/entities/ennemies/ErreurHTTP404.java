package entities.ennemies;

public class ErreurHTTP404 extends Ennemy {
	
	public ErreurHTTP404(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
		this.name = "ErreurHTTP404";
		this.HP = 50;
		this.dmg = 15;
		this.walkSpeed = 1;
		this.resistances.setResistCode(50);
		this.droppedRessources = 4;
		this.spritePath = "";
		}
}

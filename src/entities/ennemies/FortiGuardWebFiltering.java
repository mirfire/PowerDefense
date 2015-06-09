package entities.ennemies;

public class FortiGuardWebFiltering extends Ennemy {
	
	public FortiGuardWebFiltering(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
		this.name = "FortiGuardWebFiltering";
		this.HP = 500;
		this.dmg = 25;
		this.walkSpeed = 1;
		this.resistances.setResistNormal(50);
		this.droppedRessources = 50;
		this.spritePath = "";
		}
}

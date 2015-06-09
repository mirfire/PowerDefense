package entities.ennemies;

public class NullPointerAssigment extends Ennemy {
	public NullPointerAssigment(String name, int HP, int dmg, int walkSpeed,
			 int droppedRessources, String spritePath) {
		super(name, HP, dmg, walkSpeed, droppedRessources, spritePath);
		this.name = "NullPointerAssigment";
		this.HP = 10;
		this.dmg = 3;
		this.walkSpeed = 3;
		this.resistances.setResistFile(50);
		this.droppedRessources = 2;
		this.spritePath = "";
		}
}

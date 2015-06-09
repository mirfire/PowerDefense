package entities;

public class Ennemy extends Unit{
	protected int dmg;
	protected int walkSpeed;
	protected int droppedRessources;
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
	}
	public void damageWorkstation(){
		Workstation.setMaxHp = Workstation.getMaxHp() - dmg;
	}
}

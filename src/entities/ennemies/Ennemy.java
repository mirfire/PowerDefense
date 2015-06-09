package entities.ennemies;

import entities.Resistances;
import game.Game;
import entities.Unit;
import entities.Workstation;

public class Ennemy extends Unit{
	protected int dmg;
	protected int walkSpeed;
	protected int droppedRessources;
	Resistances resistances;
	private int dmgWorkstation;
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
		this.resistances = new Resistances();
	}
	public void damageWorkstation(){
		dmgWorkstation = Workstation.getMaxHp() - 5;
		Workstation.setMaxHp(dmgWorkstation);
		//this.HP = 0;
	}
	public void move(){
		return;
	}
}

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
	
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
		this.resistances = new Resistances();
	}
	public void damageWorkstation(){
		Workstation.setMaxHp(Workstation.getMaxHp() - dmg);
		this.HP = 0;
	}
	public void move(){
		return;
	}
}

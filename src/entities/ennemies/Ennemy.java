package entities.ennemies;

import game.Game;
import entities.Unit;
import entities.Workstation;

public class Ennemy extends Unit{
	protected int dmg;
	protected int walkSpeed;
	protected int droppedRessources;
	protected Resistances resistances;
	
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources,Resistances resistances, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
		this.resistances = resistances;
	}
	public void damageWorkstation(){
		Workstation.setMaxHp(Workstation.getMaxHp() - dmg);
		this.HP = 0;
	}
	public void move(){
		return;
	}
}

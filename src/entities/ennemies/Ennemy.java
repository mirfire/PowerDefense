package entities.ennemies;

import entities.towers.*;
import game.*;
import entities.Unit;
import entities.Workstation;

public class Ennemy extends Unit{
	protected int dmg;
	protected int walkSpeed;
	protected int droppedRessources;
	protected String Resistances;
	Ennemy ennemy;
	SpawnPoint spawnPoint;
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
		this.Resistances = Resistances;
	}

	
	public void damageWorkstation(){
		Workstation.workstation.setLife(Workstation.workstation.getLife() - dmg);
		this.HP = 0;
	}
	
	public void move(){
		return;
	}
	public static void SpawnEnnemies(){}
}

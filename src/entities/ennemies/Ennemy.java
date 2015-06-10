package entities.ennemies;
import entities.towers.*;
import game.Game;
import entities.Unit;
import entities.Workstation;

public class Ennemy extends Unit{
	protected int dmg;
	protected int walkSpeed;
	protected int droppedRessources;
	protected String Resistances;
	Workstation workstation = new Workstation();
	
	public Ennemy(String name, int HP, int dmg, int walkSpeed, int droppedRessources, String Resistances, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.walkSpeed = walkSpeed;
		this.droppedRessources = droppedRessources;
		this.Resistances = Resistances;
	}

	
	public void damageWorkstation(){
		workstation.setLife(workstation.getLife() - dmg);
		this.HP = 0;
	}
	
	public void move(){
		return;
	}
}

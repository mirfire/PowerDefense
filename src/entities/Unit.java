package entities;
import game.Coords;

public class Unit {
	protected int HP;
	protected boolean alive;
	protected String name;
	protected String spritePath;
	
	public Unit(String name, int HP, String spritePath) {
		this.name = name;
		this.HP = HP;
		this.spritePath = spritePath;
		this.alive = true;
	}
	
	public boolean getAlive(){
		if (this.HP > 1){
			this.alive = true;
		}
		else{
			this.alive = false;
			
		}
		return alive;
	}
}


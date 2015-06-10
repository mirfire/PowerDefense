package entities;

import javax.swing.JLabel;

public class Unit {
	protected int HP;
	protected boolean alive;
	protected String name;
	protected String spritePath;
	protected int X;
	protected int Y;
	protected JLabel image;
	
	public Unit(String name, int HP, String spritePath) {
		this.name = name;
		this.HP = HP;
		
		this.spritePath = spritePath;
		
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
	public JLabel getImage() {
		return this.image;
	}

	public void setImage(JLabel image) {
		this.image = image;
	}
	public int getX() {
		return this.X;
	}

	public void setX(int x) {
		this.X = x;
	}

	public int getY() {
		return this.Y;
	}

	public void setY(int y) {
		this.Y = y;
	}
}


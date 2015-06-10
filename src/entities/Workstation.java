package entities;

import game.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Workstation {
	public static Workstation workstation = new Workstation();
	private int maxHp = 100;
	private int life = 100;
	
	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


/*	public void repair(int life, int ressources){
		btnRepair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (life <= 8 && Game.getRessources() >= 20){
					game.setRessources(Game.getRessources() - 20);
					workstation.life = life + 5;
				}
				else{
				return 0;
			}
		});
		return;
	}*/
}
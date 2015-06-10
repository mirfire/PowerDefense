package entities;

import java.util.ArrayList;

import entities.ennemies.Ennemy;

public class wave {
	ArrayList<Ennemy> ennemies = new ArrayList<Ennemy>();
	ArrayList quantities = new ArrayList();
	
	public void addEnnemyToWave(Ennemy ennemy, int quantity){
		ennemies.add(ennemy);
		quantities.add(quantity);
	}
}
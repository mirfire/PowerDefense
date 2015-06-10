package entities;

import entities.ennemies.Ennemy;
import java.util.Random;

public class WaveEnnemies {
	private int Wave;
	private int quantity;
	private int ennemyDelay;
	WaveEnnemies waveEnnemies = new WaveEnnemies();
	
	Random rand = new Random();
	private int NuméroEnnemy = rand.nextInt(5 - 1 + 1) + 1;
	
}

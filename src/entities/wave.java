package entities;

import java.util.Random;

public class wave {

	private int waveLvl = 0;
	private int enemies = 0;
	private boolean waveSpawning;
	private int enemiesDelay = 0;
	private int spawnRate = 1000;
	Random rand = new Random();
	private int nombre = rand.nextInt(5 - 1 + 1) + 1;
	private int nombrePetit = rand.nextInt(3 - 1 + 1) + 1;

	public void nextWave() {
		this.waveLvl++;
		this.enemies = 0;
		this.waveSpawning = true;
		System.out.println("Wave" + this.waveLvl + "incomming!");
	}

	public void spawnEnemies() {
		if (waveLvl >= 3) {
			if (this.enemies < this.waveLvl * 10) {
				if (enemiesDelay < spawnRate) {
					enemiesDelay++;
				} else {
					enemiesDelay = 0;
					this.enemies++;
					switch (this.nombre) {
					case 1: // faire spawn mob
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					}

				}
			} else {
				this.waveSpawning = false;
			}
		} else {
			if (this.enemies < this.waveLvl * 10) {
				if (enemiesDelay < spawnRate) {
					enemiesDelay++;
				} else {
					enemiesDelay = 0;
					System.out.println("Enemies Spawned");
					this.enemies++;
					switch (this.nombrePetit) {
					case 1: // faire spawn mob
						break;
					case 2:
						break;
					case 3:
						break;
					}

				}
			} else {
				this.waveSpawning = false;
			}
		}
	}
}

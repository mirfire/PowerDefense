package entities.towers;

public class FireWall extends Tower {

	public FireWall(String name, int HP, int dmg, int cost, int range,
			int cooldown, DamagesTypes dmgType, String spritePath) {
		super(name, HP, dmg, cost, range, cooldown, dmgType, spritePath);
		
	

	Tower FireWall = new Tower("Fire Wall", 1, 20,50, 10, 4,DamagesTypes.NETWORK,"");
	
	
	}
}
 
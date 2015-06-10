package entities.towers;

import entities.Unit;

public class Tower extends Unit {

	protected int dmg;
	protected int cost;
	protected int range;
	protected int cooldown;
	protected DamagesTypes dmgType;

	public Tower(String name, int HP, int dmg, int cost, int range,
		int cooldown, DamagesTypes dmgType, String spritePath) {
		super(name, HP, spritePath);
		this.dmg = dmg;
		this.cost = cost;
		this.range = range;
		this.cooldown = cooldown; 
		this.dmgType = dmgType;		
	}
	
	public void killTower(int HP){		
		this.HP = 0;	
	
	}
}

/*	public void upgradeTower (Tower tower){
		btnUpgrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (game.getRessources() >= tower.cost*2){
					game.setRessources(game.getRessources() - tower.cost*2);
					tower.dmg = tower.dmg * 2;
				}
				else{
					
				}
			}
		});
	}*/
	
	
	/*public boolean checkUnit( Unit enemy ){ // check if the enemy unit is in range
		if (Ennemy.getX()-Tower.getX()<=3||Tower.getX()-Ennemy.getX()>=-3 && Ennemy.getY()-Tower.getY()<=3||Tower.getY()-Ennemy.getY()>=-3){
			
				
				return true;
			}
		}
			return true;
		}
		return false;
}*/

package entities.towers;
import entities.Unit;




public class Tower extends Unit  {
	
	protected int dmg;
	protected int  cost;
	protected int range;
	protected int cooldown;
	protected DamagesTypes dmgType;

	public Tower(String name, int HP, int dmg,int cost, int range, int cooldown, DamagesTypes dmgType,String spritePath ){
		super(name,  HP,  spritePath);
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
package menus;

public enum Menus {
	MAIN 		("MAIN"),
	NEWGAME 	("NEW"),
	LOADGAME	("LOAD"),
	INGAME 	("IG");
	
	private String typeMenu;
	
	Menus(String typeMenu) {
		this.typeMenu = typeMenu;
	}
	
	public String toString() {
		return this.typeMenu;
		
	}
}

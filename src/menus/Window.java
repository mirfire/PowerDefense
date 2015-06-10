package menus;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {	
	private MenusContainer menusContainer;
	private MainMenu mainMenu;
	private NewGameMenu newGameMenu;
	private LoadGameMenu loadGameMenu;
	private InGameMenu inGameMenu;
	static CardLayout LayoutManager;
	
	public JPanel getMenusContainer() {
		return menusContainer;
	}

	public void setMenusContainer(MenusContainer menusContainer) {
		this.menusContainer = menusContainer;
	}

	public MainMenu getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(MainMenu mainMenu) {
		this.mainMenu = mainMenu;
	}

	public NewGameMenu getNewGameMenu() {
		return newGameMenu;
	}

	public void setNewGameMenu(NewGameMenu newGameMenu) {
		this.newGameMenu = newGameMenu;
	}

	public LoadGameMenu getLoadGameMenu() {
		return loadGameMenu;
	}

	public void setLoadGameMenu(LoadGameMenu loadGameMenu) {
		this.loadGameMenu = loadGameMenu;
	}

	public InGameMenu getInGameMenu() {
		return inGameMenu;
	}

	public void setInGameMenu(InGameMenu inGameMenu) {
		this.inGameMenu = inGameMenu;
	}

	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 900);
		this.setResizable(false);
		this.setTitle("PowerDefense");	
		LayoutManager = new CardLayout(0, 0);
		menusContainer = new MenusContainer(this);
		mainMenu = new MainMenu();
		newGameMenu = new NewGameMenu();
		loadGameMenu = new LoadGameMenu();
		inGameMenu = new InGameMenu();
		
		this.add(menusContainer);
		/*menusContainer.setLayout(LayoutManager);
		menusContainer.add(mainMenu, Menus.MAIN.toString());
		menusContainer.add(newGameMenu, Menus.NEWGAME.toString());
		menusContainer.add(loadGameMenu, Menus.LOADGAME.toString());
		menusContainer.add(inGameMenu, Menus.INGAME.toString());*/
	}
	
	public void setMenuMode() {
		setSize(510, 520);
	}
	
	public void setGameMode() {
		setSize(900, 900);
	}
}

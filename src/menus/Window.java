package menus;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Window extends JFrame {	
	private JPanel menusContainer;
	private MainMenu mainMenu;
	private NewGameMenu newGameMenu;
	private LoadGameMenu loadGameMenu;
	private InGameMenu inGameMenu;
	static CardLayout LayoutManager;

	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		this.setResizable(false);
		
		LayoutManager = new CardLayout(0, 0);
		menusContainer = new JPanel();
		mainMenu = new MainMenu();
		newGameMenu = new NewGameMenu();
		loadGameMenu = new LoadGameMenu();
		inGameMenu = new InGameMenu();
		
		this.setContentPane(menusContainer);
		menusContainer.setLayout(LayoutManager);
		menusContainer.add(mainMenu, Menus.MAIN.toString());
		menusContainer.add(newGameMenu, Menus.NEWGAME.toString());
		menusContainer.add(loadGameMenu, Menus.LOADGAME.toString());
		menusContainer.add(inGameMenu, Menus.INGAME.toString());
	}
	
	public void setMenuMode() {
		setBounds(100, 100, 510, 520);
	}
	
	public void setGameMode() {
		setBounds(100, 100, 900, 900);
	}
}

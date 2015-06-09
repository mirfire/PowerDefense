package menus;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Window extends JFrame {	
	private JPanel menusContainer;
	private MainMenu mainMenu;
	private NewGameMenu newGameMenu;
	private LoadGameMenu loadGameMenu;
	static CardLayout LayoutManager;

	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		LayoutManager = new CardLayout(0, 0);
		menusContainer = new JPanel();
		mainMenu = new MainMenu();
		newGameMenu = new NewGameMenu();
		loadGameMenu = new LoadGameMenu();
		
		this.setContentPane(menusContainer);
		menusContainer.setLayout(LayoutManager);
		menusContainer.add(mainMenu, Menus.MAIN.toString());
		menusContainer.add(newGameMenu, Menus.NEWGAME.toString());
		menusContainer.add(loadGameMenu, Menus.LOADGAME.toString());
	}
}

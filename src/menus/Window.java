package menus;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Window extends JFrame {	
	static JPanel menusContainer;
	private MainMenu mainMenu;
	private NewGameMenu newGameMenu;
	static CardLayout LayoutManager;

	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		LayoutManager = new CardLayout(0, 0);
		menusContainer = new JPanel();
		mainMenu = new MainMenu();
		newGameMenu = new NewGameMenu();
		
		this.setContentPane(menusContainer);
		menusContainer.setLayout(LayoutManager);
		menusContainer.add(mainMenu, Menus.MAIN.toString());
		menusContainer.add(newGameMenu, Menus.NEWGAME.toString());
	}
}

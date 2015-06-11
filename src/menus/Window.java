package menus;

import game.Config;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {
	private static final long serialVersionUID = 5409287454413733912L;
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
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int confirmed = JOptionPane.showConfirmDialog(null,
						"Voulez vous vraiment quitter le jeu ?",
						"Confirmation", JOptionPane.YES_NO_OPTION);
				if (confirmed == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(900, 900);
		this.setResizable(false);
		this.setTitle(Config.GAME_TITLE);
		LayoutManager = new CardLayout(0, 0);
		menusContainer = new MenusContainer(this);
		mainMenu = new MainMenu();
		newGameMenu = new NewGameMenu();
		loadGameMenu = new LoadGameMenu();
		inGameMenu = new InGameMenu();

		getContentPane().add(menusContainer);
		menusContainer.setLayout(LayoutManager);
		menusContainer.add(mainMenu, Menus.MAIN.toString());
		menusContainer.add(newGameMenu, Menus.NEWGAME.toString());
		menusContainer.add(loadGameMenu, Menus.LOADGAME.toString());
		menusContainer.add(inGameMenu, Menus.INGAME.toString());
	}

	public void setMenuMode() {
		setSize(510, 520);
	}

	public void setGameMode() {
		setSize(900, 900);
	}
}

package menus;

import game.Game;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public abstract class BaseMenu extends JPanel {
	JOptionPane dlgConfirmExitGame;
	
	public void backToMainMenu() {
		Window.LayoutManager.show(getParent(), Menus.MAIN.toString());
	}
	
	public void showNewGameMenu() {
		Window.LayoutManager.show(getParent(), Menus.NEWGAME.toString());
	}
	
	public void showLoadGameMenu() {
		Window.LayoutManager.show(getParent(), Menus.LOADGAME.toString());
	}
	
	public void showConfirmExitGameDialog() {
		int n = JOptionPane.showConfirmDialog((JFrame) SwingUtilities.getRoot(this), "Voulez-vous vraiment quitter ?", "", JOptionPane.YES_NO_OPTION);
		if(n == 0)
			Game.exitGame(0);
	}
	
	public void windowSetMenuMode() {
		Window window = (Window) SwingUtilities.getWindowAncestor(getParent());
		window.setMenuMode();
	}
}

package menus;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import game.Game;
import game.Map;

import javax.imageio.ImageIO;
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
	
	public void showInGameMenu() {
		Window.LayoutManager.show(getParent(), Menus.INGAME.toString());
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
	
	public void windowSetGameMode() {
		Window window = (Window) SwingUtilities.getWindowAncestor(getParent());
		window.setGameMode();
	}
	
	public void setPanelGameBackground() {		
		Graphics g = InGameMenu.panelGame.getGraphics();
		Image img = null;
		try {
			img = ImageIO.read(new File("resources/maps/map_01.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, this);
	}
}

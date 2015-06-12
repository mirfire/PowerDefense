package menus;

import game.Coords;
import game.Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public abstract class BaseMenu extends JPanel {
	private static final long serialVersionUID = -298918690071573431L;
	protected JOptionPane dlgConfirmExitGame;
	protected JOptionPane dlgShowError;

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
		int n = JOptionPane
				.showConfirmDialog((JFrame) SwingUtilities.getRoot(this),
						"Voulez-vous vraiment quitter ?", "",
						JOptionPane.YES_NO_OPTION);
		if (n == 0)
			Game.exitGame(0);
	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog((JFrame) SwingUtilities.getRoot(this),
				message, "Erreur", JOptionPane.ERROR_MESSAGE);
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

	public Coords getClickedCase(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		x = Math.round(x / 40) + 1;
		y = Math.round(y / 40) + 1;
		Coords clickedCase = new Coords(y, x);
		return clickedCase;
	}
	
	public boolean loadInterface() {
		if(InGameMenu.panelGame.getGame() != null) {
			InGameMenu.lblGameName.setText(InGameMenu.panelGame.getGame()
					.getGameName());
			InGameMenu.lblMapName.setText(InGameMenu.panelGame.getGame().getMap()
					.getMapName());
			InGameMenu.lblResources.setText(""
					+ InGameMenu.panelGame.getGame().getResources());
			return true;
		}
		else {
			showErrorMessage("L'ID n'a pas été trouvé");
			return false;
		}
	}
}

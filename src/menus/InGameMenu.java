package menus;

import game.Config;
import game.Coords;
import game.Niveau1;
import game.Render;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class InGameMenu extends BaseMenu {
	private static final long serialVersionUID = -8351826923333261445L;
	public static Render panelGame;
	public static JPanel panelMenuGame;
	public static JPanel panelToolBar;
	public static JLabel lblGameName, lblMapName, lblResources;
	public static JMenuBar menuBar;
	public static JMenu mnGame;
	public static JMenuItem mntmLeaveGame, mntmSauvegarder;
	public static JCheckBoxMenuItem chckbxmntmPause;
	public static JSeparator separator;
	
	
	public InGameMenu() {
		
		setLayout(null);
		
		panelGame = new Render(this);
		panelGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addTower(getClickedCase(e));				
			}
		});
		panelGame.setLayout(null);
		panelGame.setBounds(10, 32, 600, 600);
		add(panelGame);
		
		panelMenuGame = new JPanel();
		panelMenuGame.setBackground(Color.ORANGE);
		panelMenuGame.setBounds(10, 643, 880, 226);
		add(panelMenuGame);
		
		panelToolBar = new JPanel();
		panelToolBar.setLayout(null);
		panelToolBar.setBackground(Color.PINK);
		panelToolBar.setBounds(620, 32, 270, 600);
		add(panelToolBar);
		
		lblGameName = new JLabel("GameName");
		lblGameName.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameName.setFont(new Font("Calibri", Font.BOLD, 25));
		lblGameName.setBounds(10, 11, 250, 30);
		panelToolBar.add(lblGameName);
		
		lblMapName = new JLabel("MapName");
		lblMapName.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblMapName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMapName.setBounds(10, 39, 250, 23);
		panelToolBar.add(lblMapName);
		
		lblResources = new JLabel("Resources");
		lblResources.setIcon(new ImageIcon("resources/interface/scrap_metal.png"));
		lblResources.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblResources.setBounds(10, 69, 250, 36);
		panelToolBar.add(lblResources);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 900, 21);
		add(menuBar);
		
		mnGame = new JMenu("Jeu");
		menuBar.add(mnGame);
		
		chckbxmntmPause = new JCheckBoxMenuItem("Pause");
		chckbxmntmPause.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
		mnGame.add(chckbxmntmPause);
		
		mntmSauvegarder = new JMenuItem("Sauvegarder");
		mntmSauvegarder.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnGame.add(mntmSauvegarder);
		
		separator = new JSeparator();
		mnGame.add(separator);
		
		mntmLeaveGame = new JMenuItem("Quitter");
		mntmLeaveGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mntmLeaveGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showConfirmExitGameDialog();
			}
		});
		mnGame.add(mntmLeaveGame);
		
	}

	public JPanel getPanelGame() {
		return panelGame;
	}

	public void setPanelGame(Render panelGame) {
		InGameMenu.panelGame = panelGame;

	}

	public JPanel getPanelMenuGame() {
		return panelMenuGame;
	}

	public void setPanelMenuGame(JPanel panelMenuGame) {
		InGameMenu.panelMenuGame = panelMenuGame;
	}

	public JPanel getPanelToolBar() {
		return panelToolBar;
	}

	public void setPanelToolBar(JPanel panelToolBar) {
		InGameMenu.panelToolBar = panelToolBar;
	}

	public JLabel getLblMapname() {
		return lblMapName;
	}

	public void setLblMapname(JLabel lblMapname) {
		InGameMenu.lblMapName = lblMapname;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		InGameMenu.menuBar = menuBar;
	}

	public JMenu getMnGame() {
		return mnGame;
	}

	public void setMnGame(JMenu mnGame) {
		InGameMenu.mnGame = mnGame;
	}

	public JMenuItem getMntmLeaveGame() {
		return mntmLeaveGame;
	}

	public void setMntmLeaveGame(JMenuItem mntmLeaveGame) {
		InGameMenu.mntmLeaveGame = mntmLeaveGame;
	}

	public JMenuItem getMntmSauvegarder() {
		return mntmSauvegarder;
	}

	public void setMntmSauvegarder(JMenuItem mntmSauvegarder) {
		InGameMenu.mntmSauvegarder = mntmSauvegarder;
	}

	public JCheckBoxMenuItem getChckbxmntmPause() {
		return chckbxmntmPause;
	}

	public void setChckbxmntmPause(JCheckBoxMenuItem chckbxmntmPause) {
		InGameMenu.chckbxmntmPause = chckbxmntmPause;
	}
	
	public int consumeResources(int consumedResources) {
		return (Integer.parseInt(InGameMenu.lblResources.getText())) - consumedResources;
	}
	
	public void setResources(int resources) {
		InGameMenu.lblResources.setText("" + resources);
	}
	
	public boolean thereIsEnoughResources(int consumedResources) {
		if((Integer.parseInt(InGameMenu.lblResources.getText()) - consumedResources) < 0)
			return false;
		return true;
	}
	
	public boolean gameIsntPaused() {
		if(this.panelGame.getGame().isPause() == false)
			return true;
		return false;
	}
	
	public void addTower(Coords coords) {
		int x = (coords.getX() - 1) * Config.GAME_CELLSIZE;
		int y = (coords.getY() - 1) * Config.GAME_CELLSIZE;
		int[][] Chemin = Niveau1.Chemin1();

		if (this.panelGame.getGame().isPause() == false) {			
			if (gameIsntPaused()) {
				if (Chemin[(x / 40)][(y / 40)] == 0) {
					if (thereIsEnoughResources(50)) {
						setResources(consumeResources(50));
						JLabel label = new JLabel();
						label.setIcon(new ImageIcon("resources/t.jpg"));
						panelGame.add(label);
						Dimension size = label.getPreferredSize();
						label.setBounds(y, x, size.width, size.height);
					} else
						showErrorMessage("Pas assez de ressources");

				} else
					showErrorMessage("Impossible de placer une tour sur le chemin");
			}
		}
	}
}

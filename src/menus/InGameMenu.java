package menus;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;


public class InGameMenu extends BaseMenu {
	JPanel panelGame, panelMenuGame, panelToolBar;
	JLabel lblMapname;
	JMenuBar menuBar;
	JMenu mnGame;
	JMenuItem mntmLeaveGame, mntmSauvegarder;
	JCheckBoxMenuItem chckbxmntmPause;
	JSeparator separator;
	
	public InGameMenu() {
		
		
		setLayout(null);
		
		panelGame = new JPanel();
		panelGame.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		panelGame.setBackground(Color.YELLOW);
		panelGame.setBounds(10, 32, 600, 600);
		add(panelGame);
		panelGame.setLayout(null);
		
		panelMenuGame = new JPanel();
		panelMenuGame.setBackground(Color.ORANGE);
		panelMenuGame.setBounds(10, 643, 880, 226);
		add(panelMenuGame);
		
		panelToolBar = new JPanel();
		panelToolBar.setLayout(null);
		panelToolBar.setBackground(Color.PINK);
		panelToolBar.setBounds(620, 32, 270, 600);
		add(panelToolBar);
		
		lblMapname = new JLabel("MapName");
		lblMapname.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblMapname.setHorizontalAlignment(SwingConstants.CENTER);
		lblMapname.setBounds(10, 10, 250, 30);
		panelToolBar.add(lblMapname);
		
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
		mnGame.add(mntmLeaveGame);

	}

	public JPanel getPanelGame() {
		return panelGame;
	}

	public void setPanelGame(JPanel panelGame) {
		this.panelGame = panelGame;
	}

	public JPanel getPanelMenuGame() {
		return panelMenuGame;
	}

	public void setPanelMenuGame(JPanel panelMenuGame) {
		this.panelMenuGame = panelMenuGame;
	}

	public JPanel getPanelToolBar() {
		return panelToolBar;
	}

	public void setPanelToolBar(JPanel panelToolBar) {
		this.panelToolBar = panelToolBar;
	}

	public JLabel getLblMapname() {
		return lblMapname;
	}

	public void setLblMapname(JLabel lblMapname) {
		this.lblMapname = lblMapname;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMnGame() {
		return mnGame;
	}

	public void setMnGame(JMenu mnGame) {
		this.mnGame = mnGame;
	}

	public JMenuItem getMntmLeaveGame() {
		return mntmLeaveGame;
	}

	public void setMntmLeaveGame(JMenuItem mntmLeaveGame) {
		this.mntmLeaveGame = mntmLeaveGame;
	}

	public JMenuItem getMntmSauvegarder() {
		return mntmSauvegarder;
	}

	public void setMntmSauvegarder(JMenuItem mntmSauvegarder) {
		this.mntmSauvegarder = mntmSauvegarder;
	}

	public JCheckBoxMenuItem getChckbxmntmPause() {
		return chckbxmntmPause;
	}

	public void setChckbxmntmPause(JCheckBoxMenuItem chckbxmntmPause) {
		this.chckbxmntmPause = chckbxmntmPause;
	}
	
	
}

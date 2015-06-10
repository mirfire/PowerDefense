package menus;

import game.Render;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class InGameMenu extends BaseMenu {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8351826923333261445L;
	static Render panelGame;
	static JPanel panelMenuGame;
	static JPanel panelToolBar;
	static JLabel lblMapname;
	static JMenuBar menuBar;
	static JMenu mnGame;
	static JMenuItem mntmLeaveGame, mntmSauvegarder;
	static JCheckBoxMenuItem chckbxmntmPause;
	static JSeparator separator;
	
	
	public InGameMenu() {
		
		setLayout(null);
		
		panelGame = new Render(this);
		panelGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getClickedCase(e);
				int x=e.getX();
			    int y=e.getY();
			    x = Math.round(x / 40) + 1;
			    y = Math.round(y / 40) + 1;
			    x=(x-1)*40;
			    y=(y-1)*40;
			    
			   System.out.println(x);
			   System.out.println(y);
				JFrame frame = new JFrame("Display Image");  
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		        
		        panelGame.setLayout(null);
				JLabel label = new JLabel();  
		        label.setIcon(new ImageIcon("resources/t.jpg"));
		        panelGame.add(label);
		        Dimension size = label.getPreferredSize();
		        label.setBounds(x, y, size.width, size.height);

		        frame.setSize(10, 10);
		        frame.setVisible(false);
				
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
		return lblMapname;
	}

	public void setLblMapname(JLabel lblMapname) {
		InGameMenu.lblMapname = lblMapname;
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
}

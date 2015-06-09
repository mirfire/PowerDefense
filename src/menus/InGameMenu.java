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


public class InGameMenu extends BaseMenu {

	public InGameMenu() {
		setLayout(null);
		
		JPanel panelGame = new JPanel();
		panelGame.setBackground(Color.YELLOW);
		panelGame.setBounds(10, 32, 600, 600);
		add(panelGame);
		
		JPanel panelMenuGame = new JPanel();
		panelMenuGame.setBackground(Color.ORANGE);
		panelMenuGame.setBounds(10, 643, 880, 226);
		add(panelMenuGame);
		
		JPanel panelToolBar = new JPanel();
		panelToolBar.setBackground(Color.PINK);
		panelToolBar.setBounds(620, 32, 270, 600);
		add(panelToolBar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 900, 21);
		add(menuBar);
		
		JMenu mnJeu = new JMenu("Jeu");
		menuBar.add(mnJeu);
		
		JCheckBoxMenuItem chckbxmntmPause = new JCheckBoxMenuItem("Pause");
		chckbxmntmPause.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
		mnJeu.add(chckbxmntmPause);
		
		JMenuItem mntmSauvegarder = new JMenuItem("Sauvegarder");
		mntmSauvegarder.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnJeu.add(mntmSauvegarder);
		
		JSeparator separator = new JSeparator();
		mnJeu.add(separator);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnJeu.add(mntmQuitter);

	}
}

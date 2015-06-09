package menus;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends BaseMenu {

	public MainMenu() {
		setLayout(null);
		
		JButton btnNouvellePartie = new JButton("Nouvelle Partie");
		btnNouvellePartie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showNewGameMenu();
			}
		});
		btnNouvellePartie.setBounds(150, 266, 200, 50);
		add(btnNouvellePartie);
		
		JButton btnLoadGame = new JButton("Charger Partie");
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showLoadGameMenu();
			}
		});
		btnLoadGame.setBounds(150, 337, 200, 50);
		add(btnLoadGame);
		
		JButton btnExitGame = new JButton("Quitter");
		btnExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showConfirmExitGameDialog();
			}
		});
		btnExitGame.setBounds(150, 411, 200, 50);
		add(btnExitGame);
		

	}
}

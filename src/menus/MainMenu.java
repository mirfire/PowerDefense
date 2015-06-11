package menus;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MainMenu extends BaseMenu {

	private static final long serialVersionUID = -4112595258490648746L;

	public MainMenu() {
		setLayout(null);
		addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				windowSetMenuMode();
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});

		JButton btnNouvellePartie = new JButton("Nouvelle Partie");
		btnNouvellePartie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showNewGameMenu();
			}
		});
		btnNouvellePartie.setBounds(150, 260, 200, 50);
		add(btnNouvellePartie);

		JButton btnLoadGame = new JButton("Charger Partie");
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showLoadGameMenu();
			}
		});
		btnLoadGame.setBounds(150, 340, 200, 50);
		add(btnLoadGame);

		JButton btnExitGame = new JButton("Quitter");
		btnExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showConfirmExitGameDialog();
			}
		});
		btnExitGame.setBounds(150, 420, 200, 50);
		add(btnExitGame);

		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(10, 10, 480, 200);
		add(panelLogo);
		panelLogo.setLayout(new BorderLayout(0, 0));

		ImageIcon logo = new ImageIcon("resources/logo.png");
		JLabel lblLogo = new JLabel("", logo, JLabel.CENTER);
		lblLogo.setSize(480, 50);
		lblLogo.setLocation(10, 0);
		panelLogo.add(lblLogo, BorderLayout.CENTER);
	}
}

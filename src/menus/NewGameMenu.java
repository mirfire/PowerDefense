package menus;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class NewGameMenu extends BaseMenu {

	public NewGameMenu() {
		setLayout(null);
		
		JTextPane txtNewGameName = new JTextPane();
		txtNewGameName.setBounds(94, 347, 311, 20);
		add(txtNewGameName);
		
		JButton btnBackToMainMenu = new JButton("Retour");
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backToMainMenu();
			}
		});
		btnBackToMainMenu.setBounds(150, 439, 200, 50);
		add(btnBackToMainMenu);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(10, 30, 480, 200);
		add(panelLogo);
		panelLogo.setLayout(new BorderLayout(0, 0));
		
		ImageIcon logo = new ImageIcon("resources/logo.png");
		JLabel lblLogo = new JLabel("", logo, JLabel.CENTER);
		lblLogo.setSize(480, 50);
		lblLogo.setLocation(10, 0);
		panelLogo.add(lblLogo, BorderLayout.CENTER);
		
		JLabel lblNomDeLa = new JLabel("Nom de la Partie");
		lblNomDeLa.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomDeLa.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNomDeLa.setBounds(94, 326, 165, 20);
		add(lblNomDeLa);
		
		JButton btnLaunchNewGame = new JButton("Lancer Partie !");
		btnLaunchNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInGameMenu();
				windowSetGameMode();
			}
		});
		btnLaunchNewGame.setBounds(150, 378, 200, 50);
		add(btnLaunchNewGame);
	}
}

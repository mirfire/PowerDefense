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
import javax.swing.UIManager;

import database.ReadData;

public class LoadGameMenu extends BaseMenu {
	private static final long serialVersionUID = 6607761919422010142L;
	
	JButton btnBackToMainMenu, btnLoadGame;
	JLabel lblLogo, lblGameID;
	JPanel panelLogo;
	JTextPane txtLoadGameID;
	
	public LoadGameMenu() {
		setLayout(null);

		btnBackToMainMenu = new JButton("Retour");
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backToMainMenu();
			}
		});
		btnBackToMainMenu.setBounds(150, 439, 200, 50);
		add(btnBackToMainMenu);

		panelLogo = new JPanel();
		panelLogo.setBounds(10, 10, 480, 200);
		add(panelLogo);
		panelLogo.setLayout(new BorderLayout(0, 0));

		ImageIcon logo = new ImageIcon("resources/logo.png");
		lblLogo = new JLabel("", logo, JLabel.CENTER);
		lblLogo.setSize(480, 50);
		lblLogo.setLocation(10, 0);
		panelLogo.add(lblLogo, BorderLayout.CENTER);

		lblGameID = new JLabel("ID de la partie");
		lblGameID.setHorizontalAlignment(SwingConstants.LEFT);
		lblGameID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblGameID.setBounds(94, 326, 165, 20);
		add(lblGameID);

		txtLoadGameID = new JTextPane();
		txtLoadGameID.setBounds(94, 347, 311, 20);
		txtLoadGameID.setBorder(UIManager.getBorder("TextField.border"));
		add(txtLoadGameID);

		btnLoadGame = new JButton("Charger Partie !");
		btnLoadGame.setBounds(150, 378, 200, 50);
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtLoadGameID.getText() != null) {
					try {
						int gameID = Integer.parseInt(txtLoadGameID.getText());
						ReadData data = new ReadData();
						InGameMenu.panelGame.setGame(data.readSavedGameFromDB(gameID));
						if(loadInterface() == true) {
							showInGameMenu();
							windowSetGameMode();
						}
					}
					catch(NumberFormatException err) {
						showErrorMessage("Vous n'avez pas entré de chiffre.");
					}
				} else {
					showErrorMessage("Votre nom de partie doit faire au moins trois caractères.");
				}
			}
		});
		add(btnLoadGame);
	}
}

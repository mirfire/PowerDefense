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

	/**
	 * 
	 */
	private static final long serialVersionUID = -3611441847895404790L;

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
		
		JLabel lblGameName = new JLabel("Nom de la Partie");
		lblGameName.setHorizontalAlignment(SwingConstants.LEFT);
		lblGameName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblGameName.setBounds(94, 326, 165, 20);
		add(lblGameName);
		
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

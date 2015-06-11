package menus;

import game.Game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class NewGameMenu extends BaseMenu {
	private static final long serialVersionUID = -3611441847895404790L;
	
	private JPanel panelLogo;
	private JLabel lblLogo, lblGameName;
	private JButton btnLaunchNewGame, btnBackToMainMenu;
	public static JTextPane txtNewGameName;
	
	public NewGameMenu() {
		setLayout(null);
		
		txtNewGameName = new JTextPane();
		txtNewGameName.setBorder(UIManager.getBorder("TextField.border"));
		txtNewGameName.setBounds(94, 347, 311, 20);
		add(txtNewGameName);
		
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
		
		lblGameName = new JLabel("Nom de la Partie");
		lblGameName.setHorizontalAlignment(SwingConstants.LEFT);
		lblGameName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblGameName.setBounds(94, 326, 165, 20);
		add(lblGameName);
		
		btnLaunchNewGame = new JButton("Lancer Partie !");
		btnLaunchNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkGameName() == true) {
					InGameMenu.panelGame.setGame(createGame(txtNewGameName.getText()));
					loadInterface();
					showInGameMenu();
					windowSetGameMode();
				}
				else {
					showErrorMessage("Votre nom de partie doit faire au moins trois caractères.");
				}
			}
		});
		btnLaunchNewGame.setBounds(150, 378, 200, 50);
		add(btnLaunchNewGame);
		
		JRadioButton radioMap1 = new JRadioButton("Carte 1");
		radioMap1.setSelected(true);
		radioMap1.setBounds(12, 296, 109, 23);
		add(radioMap1);
		
		JRadioButton radioMap2 = new JRadioButton("Carte 2");
		radioMap2.setBounds(133, 296, 109, 23);
		add(radioMap2);
		
		JRadioButton radioMap3 = new JRadioButton("Carte 3");
		radioMap3.setBounds(254, 296, 109, 23);
		add(radioMap3);
		
		JRadioButton radioMap4 = new JRadioButton("Carte 4");
		radioMap4.setBounds(375, 296, 109, 23);
		add(radioMap4);
		
		ButtonGroup chooseMapRadios = new ButtonGroup();
		chooseMapRadios.add(radioMap1);
		chooseMapRadios.add(radioMap2);
		chooseMapRadios.add(radioMap3);
		chooseMapRadios.add(radioMap4);
	}
	
	public Game createGame(String gameName) {
		Game game = new Game(gameName);		
		return game;
	}
	
	public void loadInterface() {
		InGameMenu.lblGameName.setText(InGameMenu.panelGame.getGame().getGameName());
		InGameMenu.lblMapName.setText(InGameMenu.panelGame.getGame().getMap().getMapName());
		InGameMenu.lblResources.setText("" + InGameMenu.panelGame.getGame().getRessources());
	}
	
	public boolean checkGameName() {
		String enteredText = txtNewGameName.getText();
		
		if(enteredText == null)
			return false;
		if(enteredText.length() < 3)
			return false;		
		return true;
	}
}

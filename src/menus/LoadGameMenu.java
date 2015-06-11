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

public class LoadGameMenu extends BaseMenu {
	private static final long serialVersionUID = 6607761919422010142L;

	public LoadGameMenu() {
		setLayout(null);
			
		JButton btnBackToMainMenu = new JButton("Retour");
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backToMainMenu();
			}
		});
		btnBackToMainMenu.setBounds(150, 439, 200, 50);
		add(btnBackToMainMenu);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(10, 10, 480, 200);
		add(panelLogo);
		panelLogo.setLayout(new BorderLayout(0, 0));
		
		ImageIcon logo = new ImageIcon("resources/logo.png");
		JLabel lblLogo = new JLabel("", logo, JLabel.CENTER);
		lblLogo.setSize(480, 50);
		lblLogo.setLocation(10, 0);
		panelLogo.add(lblLogo, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Nom de la Partie");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Calibri", Font.PLAIN, 14));
		label.setBounds(94, 326, 165, 20);
		add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(94, 347, 311, 20);
		add(textPane);
		
		JButton btnChargerPartie = new JButton("Charger Partie !");
		btnChargerPartie.setBounds(150, 378, 200, 50);
		add(btnChargerPartie);
	}
}

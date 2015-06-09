package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class NewGameMenu extends BaseMenu {

	public NewGameMenu() {
		setLayout(null);
		
		JTextPane txtNewGameName = new JTextPane();
		txtNewGameName.setBounds(144, 146, 143, 20);
		add(txtNewGameName);
		
		JButton btnBackToMainMenu = new JButton("Retour");
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backToMainMenu();
			}
		});
		btnBackToMainMenu.setBounds(144, 364, 200, 50);
		add(btnBackToMainMenu);

	}
}

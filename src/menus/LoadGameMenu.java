package menus;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoadGameMenu extends BaseMenu {
	private JTextField textField;

	public LoadGameMenu() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(89, 220, 322, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDeLa = new JLabel("Nom de la Partie");
		lblNomDeLa.setBounds(89, 204, 322, 14);
		add(lblNomDeLa);
		
		JButton btnBackToMainMenu = new JButton("Retour");
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backToMainMenu();
			}
		});
		btnBackToMainMenu.setBounds(150, 415, 200, 50);
		add(btnBackToMainMenu);

	}
}

package menus;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewGameMenu extends JPanel {

	public NewGameMenu() {
		setLayout(null);
		
		JTextPane txtpnBite = new JTextPane();
		txtpnBite.setText("BITE");
		txtpnBite.setBounds(144, 146, 143, 20);
		add(txtpnBite);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window.LayoutManager.show(getParent(), Menus.MAIN.toString());
			}
		});
		btnRetour.setBounds(156, 312, 89, 23);
		add(btnRetour);

	}
}

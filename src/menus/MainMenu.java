package menus;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {

	public MainMenu() {
		setLayout(null);
		
		JButton btnNouvellePartie = new JButton("Nouvelle Partie");
		btnNouvellePartie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.LayoutManager.show(getParent(), Menus.NEWGAME.toString());
			}
		});
		btnNouvellePartie.setBounds(142, 266, 120, 23);
		add(btnNouvellePartie);
		

	}
}

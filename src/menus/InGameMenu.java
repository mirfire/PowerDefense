package menus;
import javax.swing.JPanel;
import java.awt.Color;


public class InGameMenu extends BaseMenu {

	public InGameMenu() {
		setLayout(null);
		
		JPanel panelGame = new JPanel();
		panelGame.setBackground(Color.YELLOW);
		panelGame.setBounds(23, 11, 600, 600);
		add(panelGame);
		
		JPanel panelMenuGame = new JPanel();
		panelMenuGame.setBackground(Color.ORANGE);
		panelMenuGame.setBounds(10, 622, 627, 257);
		add(panelMenuGame);

	}

}

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import menus.Window;
public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		try {
			Window frame = new Window();
			frame.setTitle("PowerDefense");
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

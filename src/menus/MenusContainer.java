package menus;

import java.awt.Frame;

import javax.swing.JPanel;

public class MenusContainer extends JPanel implements Runnable {
	private static final long serialVersionUID = 871294247435865586L;
	Thread menuThread =  new Thread(this);
	Frame windowFrame;

	public MenusContainer(Frame frame) {
		menuThread.start();
		this.windowFrame = frame;
	}	
	
	public void run() {
		System.out.println("Menus lancés");
	}	
}

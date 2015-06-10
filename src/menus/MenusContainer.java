package menus;

import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenusContainer extends JPanel implements Runnable {
	
	Thread menuThread =  new Thread(this);
	
	private final long DELAY = 1;
	private int FPS = 0; 
	int frames = 0;

	public MenusContainer(Frame frame) {
		menuThread.start();
	}
	
	public void run() {
		System.out.println("Menus lancés");
	}
}

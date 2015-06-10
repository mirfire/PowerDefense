package menus;

import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenusContainer extends JPanel implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 871294247435865586L;
	Thread menuThread =  new Thread(this);
	Frame windowFrame;
	
	private final long DELAY = 1;
	private int FPS = 0; 
	int frames = 0;

	public MenusContainer(Frame frame) {
		menuThread.start();
		this.windowFrame = frame;
	}	
	
	public void run() {
		System.out.println("Menus lancés");
	}
	
	private void drawFPS(Graphics g) {
		g.clearRect(0, 0, this.windowFrame.getWidth(), this.windowFrame.getHeight());
		g.drawString(FPS + "FPS", 1, 10);
		
		
	}
	
	private long countFPS(long lastFrame) {
		frames++;
		if(System.currentTimeMillis() - 1000 >= lastFrame) {
			this.FPS = frames;
			this.frames = 0;
			lastFrame = System.currentTimeMillis();
		}
		return lastFrame;
		
	}

	
}

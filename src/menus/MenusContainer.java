package menus;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenusContainer extends JPanel implements Runnable {
	
	Thread menuThread =  new Thread(this);
	Frame windowFrame;
	
	private final long DELAY = 1;
	private int FPS = 0; 
	int frames = 0;

	public MenusContainer(Frame frame) {
		menuThread.start();
		this.windowFrame = frame;
	}
	

	
	public void paintComponent(Graphics g) {
		drawFPS(g);		
		
		}
	
	
	public void run() {
		System.out.println("Menus lancés");
		
		long lastFrame = System.currentTimeMillis();
		
		// Boucle de l'interface
		while(true) {			
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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

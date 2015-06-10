package game;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Render extends JPanel implements Runnable {	
	Thread menuThread =  new Thread(this);
	Game game;
	Map map;
	JPanel parentPanel;	
	
	private final long DELAY = 1;
	private int FPS = 0; 
	int frames = 0;
	
	public Render(JPanel panel) { 
		menuThread.start();
		this.parentPanel = panel;
		game = new Game("GameTest");		
	}

	public void run() {
		System.out.println("Moteur de rendu lancé");
		long lastFrame = System.currentTimeMillis();
		
		// Boucle du jeu
		while(true) {
			repaint();
			lastFrame = countFPS(lastFrame);
			
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		clearGameScreen(g);
		
		drawBackgroundImage(g);
		
		
		Grid(g);
		
		drawFPS(g);
		
	}
	
	private void Grid(Graphics g){		
        int larg = getWidth(); 
        int haut = getHeight();     
        int dim = 40;        
        for(int i = 0; i < larg; i +=dim) {
        	g.drawLine(i,0,i, haut); // Les lignes verticales de la grille
        	g.drawLine(0,i,larg, i); // Les lignes horizontales de la grille
        }
        
	}
	private void clearGameScreen(Graphics g) {
		g.clearRect(0, 0, this.parentPanel.getWidth(), this.parentPanel.getHeight());
	}
	
	private void drawFPS(Graphics g) {
		g.drawString(FPS + "FPS", 1, 10);
	}
	
	private void drawBackgroundImage(Graphics g) {
		g.drawImage(this.game.map.getBackgroundImage(), 0, 0, this);
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

package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import menus.InGameMenu;
import menus.NewGameMenu;

public class Render extends JPanel implements Runnable {
	private static final long serialVersionUID = 7990237525170526056L;
	Thread gameThread = new Thread(this);
	Game game;
	JPanel parentPanel;

	private final long DELAY = 1;
	private int FPS = 0;
	int frames = 0;

	public Render(JPanel panel) {
		gameThread.start();
		this.parentPanel = panel;
	}

	public void run() {
		System.out.println("Moteur de rendu lancé");
		long lastFrame = System.currentTimeMillis();

		// Boucle du jeu
		while (true) {
			repaint();
			lastFrame = countFPS(lastFrame);
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void paintComponent(Graphics g) {
		clearGameScreen(g);

		drawBackgroundImage(g);
		drawSpawnPoint(g);
		drawWorkstation(g);
		Grid(g);

		if (checkPause())
			drawPause(g);
		drawFPS(g);
	}

	private void drawCase(Graphics g) {
		Case cases[][] = this.game.map.getCases();
		for (Case[] u : cases) {
			for (Case elem : u) {
				g.drawImage(elem.getSprite(), 0, 0, this);
			}
		}
	}

	private void drawSpawnPoint(Graphics g) {
		try {
			Image spawnPointImage = ImageIO.read(new File(
					"resources/sprites/lightning.png"));
			int y = (this.game.map.getSpawnPoint().getCoords().getX() - 1) * 40 + 1;
			int x = (this.game.map.getSpawnPoint().getCoords().getY() - 1) * 40 + 1;
			g.drawImage(spawnPointImage, y, x, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void drawWorkstation(Graphics g) {
		try {
			Image workstationImage = ImageIO.read(new File(
					"resources/sprites/workstation.png"));
			int y = (this.game.map.getWorkstation().getCoords().getX() - 1) * 40 + 1;
			int x = (this.game.map.getWorkstation().getCoords().getY() - 1) * 40 + 1;
			g.drawImage(workstationImage, y, x, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void Grid(Graphics g) {
		int larg = getWidth();
		int haut = getHeight();
		int dim = Config.GAME_CELLSIZE;
		for (int i = 0; i < larg; i += dim) {
			g.drawLine(i, 0, i, haut); // Les lignes verticales de la grille
			g.drawLine(0, i, larg, i); // Les lignes horizontales de la grille
		}

	}

	private void clearGameScreen(Graphics g) {
		g.clearRect(0, 0, this.parentPanel.getWidth(),
				this.parentPanel.getHeight());
	}

	private void drawFPS(Graphics g) {
		g.setFont(new Font("Consolas", Font.PLAIN, 13));
		g.setColor(Color.BLACK);
		g.drawString(FPS + "FPS", 1, 10);
	}

	private void drawPause(Graphics g) {
		String s = "PAUSE";
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.setFont(new Font("Calibri", Font.BOLD, 64));
		int stringLen = (int) g2.getFontMetrics().getStringBounds(s, g2)
				.getWidth();
		int start = this.getWidth() / 2 - stringLen / 2;
		g2.drawString(s, start + 1, 300);
	}

	private void drawBackgroundImage(Graphics g) {
		g.drawImage(this.game.map.getBackgroundImage(), 0, 0, this);
	}

	private long countFPS(long lastFrame) {
		frames++;
		if (System.currentTimeMillis() - 1000 >= lastFrame) {
			this.FPS = frames;
			this.frames = 0;
			lastFrame = System.currentTimeMillis();
		}
		return lastFrame;
	}

	public boolean checkPause() {
		this.game.setPause(InGameMenu.chckbxmntmPause.getState());
		if (this.game.isPause() == true)
			return true;
		return false;
	}
}

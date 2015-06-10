package game;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import database.ReadData;
import entities.Workstation;

public class Map {
	private String mapName;
	private String backgroundPath;
	private Image backgroundImage;
	private long width;
	private long height;
	private Case cases[][];
	private int x;
	private int y;
	private SpawnPoint spawnPoint;
	private Workstation workstation;
	private int Chemin[][];

	public Map(String mapName, String backgroundPath, int width, int height, int[][] Chemin) {
		this.backgroundPath = backgroundPath;
		this.seekBackgroundImage(backgroundPath);;
		this.width = width;
		this.height = height;
		this.cases = new Case[height][width];
		this.Chemin = Chemin;
	}
	
	public Map() {
		this.mapName = null;
		this.backgroundPath = null;
		this.backgroundImage = null;
		this.width = 0;
		this.height = 0;
		this.spawnPoint = null;
		this.workstation = null;
	}

	public Map(String mapName, String backgroundPath) {
		this.mapName = mapName;
		this.backgroundPath = backgroundPath;
		this.width = 15;
		this.height = 15;
		this.spawnPoint = new SpawnPoint(1,1);
	}
	
	public Map(int mapID) {
		readMapFromDB(mapID);
	}
	
	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getBackgroundPath() {
		return backgroundPath;
	}

	public void setBackgroundPath(String backgroundPath) {
		this.backgroundPath = backgroundPath;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}

	public Image getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(Image backgroundImage) {
		this.backgroundImage = backgroundImage;
	}
	
	public void seekBackgroundImage(String backgroundPath) {
		try {
			this.backgroundImage = ImageIO.read(new File(backgroundPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public SpawnPoint getSpawnPoint() {
		return spawnPoint;
	}

	public void setSpawnPoint(SpawnPoint spawnPoint) {
		this.spawnPoint = spawnPoint;
	}

	public Workstation getWorkstation() {
		return workstation;
	}

	public void setWorkstation(Workstation workstation) {
		this.workstation = workstation;
	}

	private void readMapFromFile() {
		String data = "", currentLine;
		try {
			BufferedReader br = new BufferedReader(new FileReader("map_01.json"));
			try {
				while ((currentLine = br.readLine()) != null) {
					data = data + currentLine;
				}
			} catch (IOException e) {
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Object obj = JSONValue.parse(data);
			JSONObject  readData = (JSONObject )obj;
			this.mapName = (String) readData.get("mapName");
			this.backgroundPath = (String) readData.get("backgroundPath");
			this.width = 15;
			this.height = 15;
			this.cases = new Case[(int) height][(int) width];
			JSONArray SpawnPoint = (JSONArray) readData.get("spawnPoint");
			this.spawnPoint = new SpawnPoint((int) (long) SpawnPoint.get(0), (int) (long) SpawnPoint.get(1));
		} 
		catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	static Map readMapFromDB(int mapID) {
		ReadData readData = new ReadData();
		return readData.readMapFromDB(mapID);
	}
}

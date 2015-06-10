package game;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Map {
	private String mapName;
	private String backgroundPath;
	private Image backgroundImage;
	private int width;
		private int height;
	private Case cases[][];
	
	public Map(String mapName, String backgroundPath, int width, int height) {
		this.mapName = mapName;
		this.backgroundPath = backgroundPath;
		this.width = width;
		this.height = height;
		this.cases = new Case[height][width];
	}
	
	public Map() {
		readMap();
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
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
	
	private void readMap() {
		String data = null, currentLine;
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
			this.width = (int) readData.get("width");
			this.height = (int) readData.get("height");
			this.cases = new Case[height][width];
		} 
		catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}

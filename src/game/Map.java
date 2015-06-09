package game;

public class Map {
	private String mapName;
	private String backgroundPath;
	private int width;
	private int height;
	private Case[][] cases;
	
	public Map(String mapName, String backgroundPath, int width, int height) {
		this.mapName = mapName;
		this.backgroundPath = backgroundPath;
		this.width = width;
		this.height = height;
	}
}

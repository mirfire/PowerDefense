package game;

public class SpawnPoint {
	private Coords coords;
	
	public SpawnPoint(int x, int y) {
		setCoords(new Coords(x, y));
	}
	
	public Coords getCoords() {
		return coords;
	}
	
	public void setCoords(Coords coords) {
		this.coords = coords;
	}
}

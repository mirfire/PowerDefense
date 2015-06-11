package database;

import entities.Workstation;
import game.Config;
import game.Map;
import game.SpawnPoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
	Connection connToDB;
	Statement statement;
	ResultSet results;
	String sqlQuery;

	public ReadData() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			connToDB = DriverManager.getConnection(Config.DB_CONNECTION_URL,
					Config.DB_USER, Config.DB_PASS);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			this.statement = connToDB.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Map readMapFromDB(int mapID) {
		Map map = new Map();
		this.sqlQuery = "SELECT * FROM maps WHERE `mapID`=" + mapID + ";";
		try {
			results = statement.executeQuery(sqlQuery);
			if (results.next()) {
				map.setMapName(results.getString("mapName"));
				map.setMapID(results.getInt("mapID"));
				map.setBackgroundPath(results.getString("backgroundPath"));
				map.seekBackgroundImage(map.getBackgroundPath());
				map.setHeight(results.getInt("height"));
				map.setWidth(results.getInt("width"));
				map.setSpawnPoint(readSpawnPointFromDB(mapID));
				map.setWorkstation(readWorkstationFromDB(mapID));
				return map;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public SpawnPoint readSpawnPointFromDB(int mapID) {
		SpawnPoint spawnPoint = new SpawnPoint();
		this.sqlQuery = "SELECT * FROM spawnpoint WHERE `mapID`=" + mapID + ";";
		try {
			results = statement.executeQuery(sqlQuery);
			if (results.next()) {
				spawnPoint.getCoords().setX(results.getInt("x"));
				spawnPoint.getCoords().setY(results.getInt("y"));
				return spawnPoint;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Workstation readWorkstationFromDB(int mapID) {
		Workstation workstation = new Workstation();
		this.sqlQuery = "SELECT * FROM workstation WHERE `mapID`=" + mapID + ";";
		try {
			results = statement.executeQuery(sqlQuery);
			if (results.next()) {
				workstation.getCoords().setX(results.getInt("x"));
				workstation.getCoords().setY(results.getInt("y"));
				return workstation;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

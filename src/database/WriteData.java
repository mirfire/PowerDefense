package database;

import game.Config;
import game.Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteData {
	Connection connToDB;
	Statement statement;
	ResultSet results;
	String sqlQuery;

	public WriteData() {
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
	
	public void saveGameToDB(Game game) {
		this.sqlQuery = "INSERT INTO saved_games" +
			"(`gameName`, `mapID`, `score`, `survivedTime`, `kills`)" +
			"VALUES ('" + 
			game.getGameName() +
			"'," +
			game.getMap().getMapID() +
			" ," +
			game.getScore() +
			" ," +
			game.getSurvivedTime() +
			" ," +
			game.getKills() +
			");";
		try {
			this.statement.executeUpdate(sqlQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
package database;

import game.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {

	public static void AjouterP(String gameName, int workstationHP,
			int nbResources, int survivedTime, int numMap, int numWave) {

		try {
			String query = "INSERT INTO sauvegarde VALUES(\"" + gameName
					+ "\"," + workstationHP + "," + nbResources + ","
					+ survivedTime + "," + numMap + "," + numWave + ")";
			System.out.println(query);
			Connection myConn = DriverManager.getConnection(Config.DB_CONNECTION_URL, Config.DB_USER, Config.DB_PASS);
			Statement myStmt = myConn.createStatement();
			myStmt.executeUpdate(query);
			System.out.println("partie sauvegardée");

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
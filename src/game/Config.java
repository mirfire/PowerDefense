package game;

public class Config {
	
	// Base de Données
	public final static String DB_USER 			= "root";
	public final static String DB_PASS 			= "";
	public final static String DB_URL 				= "127.0.0.1";
	public final static String DB_PORT				= "3306";
	public final static String DATABASE			= "projet_java";
	public final static String DB_CONNECTION_URL 	= "jdbc:mysql://" + DB_URL + ":" + DB_PORT + "/" + DATABASE;
	
	// Jeu
	public final static String GAME_TITLE 		= "PowerDefense";
	public final static int GAME_CELLSIZE 		= 40;
	
}

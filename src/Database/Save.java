
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {
	

	public static void main(String[] args) {
		AjouterP("une",30,150,45,1,5);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/powerdefense", "antho","123");
			
			Statement myStmt = myConn.createStatement();
		
			ResultSet myRs = myStmt.executeQuery("select* from sauvegarde ");
		
			while	(myRs.next())	{
				System.out.println(myRs.getString("Nom de la partie") + "," +myRs.getInt("Point de vie dela Base") + "," + myRs.getInt("Ressource") +","+ myRs.getInt("Temps") +","+ myRs.getInt("Num�ro de la map")+ "," + myRs.getInt("Num�ro de la vague"));			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		
	}
	}




	public static void AjouterP(String Nomdelapartie, int Pointdeviedelabase,int Ressource,int Temps,int Num�rodelamap,int Num�rodelavague) {
	
		
	
	
	
	try{
		String query="INSERT INTO sauvegarde VALUES(\"" + Nomdelapartie + "\","+Pointdeviedelabase+","+Ressource+","+Temps+","+Num�rodelamap+","+Num�rodelavague+")";
		System.out.println(query);
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/powerdefense", "antho","123");
		
		Statement myStmt = myConn.createStatement();
		myStmt.executeUpdate(query);
		System.out.println("partie sauvegard�e");

	}
	catch(SQLException e){
		;
	}
	}
}

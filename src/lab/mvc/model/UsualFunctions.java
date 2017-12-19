package lab.mvc.model;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class UsualFunctions {

	public Connection connectDB() {
		try {
			 Class.forName( "com.mysql.jdbc.Driver" );
					 // Class.forName("oracle.jdbc.OracleDriver") ;
		} catch ( ClassNotFoundException e ) {
			 e.printStackTrace();
		}
					
		String url = "jdbc:mysql://localhost:3306/HomeSwopHome?autoReconnect=true&useSSL=false";
		String user = "root";
		String pass = "root";
		Connection connexion = null;
		try {
		 connexion = (Connection) DriverManager.getConnection( url, user, pass );
		 /* Requests to bdd will be here */
		} catch ( SQLException e ) {
			e.printStackTrace();
		} 
			
		return connexion;
		
	}
			
}

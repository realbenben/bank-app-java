package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
		private static Connection connection = null;
		
		public static void connect() throws SQLException {
			
	
		try {
			Class.forName("org.postgresql.Driver");
		      connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank","postgres","SuperUser");
//		      System.out.println("query done");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		}
	
	public static Connection getConnexion() {
		return connection;
	}

}

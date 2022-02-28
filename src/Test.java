import java.sql.*;

public class Test {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("org.postgresql.Driver");
		      Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank","postgres","SuperUser");
		      Statement st = conn.createStatement();
		      ResultSet res = st.executeQuery("SELECT * FROM conseiller");
		      
		      while(res.next())
		    	  
		    	System.out.println(res.getInt(1) + " " +res.getString(2) + " " + res.getString(3));
		      	conn.close(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}

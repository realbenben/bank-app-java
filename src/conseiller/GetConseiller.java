package conseiller;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbConnection;


public class GetConseiller {
	
	private static Connection conn;
	
	public GetConseiller() throws SQLException {
		DbConnection.connect();
		conn=DbConnection.getConnexion();// conn =  DriverManager.getConnection(url , userName, password);
	}
	
//	public void addConseiller(Conseiller c) {
//		try {
//			PreparedStatement ps = conn.prepareStatement("insert into conseiller (idconseiller, name, firstname, password) values (?,?,?,?)");
//			
//			ps.setInt(1, c.getIdConseiller());
//			ps.setString(2, c.getName());
//			ps.setString(3, c.getFirstName());
//			ps.setString(4, c.getPassword());
//			ps.executeUpdate();
//			ps.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	public Conseiller getCons(String firstName) {
		Conseiller cons = null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from conseiller where firstname = ?");
			ps.setString(1, firstName);
			
			ResultSet resultat = ps.executeQuery();
			if (resultat.next()) {
				cons = new Conseiller(0, null, firstName, null);
				cons.setIdConseiller(resultat.getInt("idconseiller"));
				cons.setName(resultat.getString("name"));
				cons.setFirstName(resultat.getString("firstname"));
				cons.setPassword(resultat.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cons;
		
	}
	

	



	
	
}

package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public boolean connect() {
		String url = "jdbc:postgresql://localhost:5432/ZadDatb";
		String user = "Visitor";
	    String pass = "basicpass123";
	    
	    try {
			Connection conn=DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.out.println("Failed to connect to datavase");
			return false;
		}
	    return true;
	}

}

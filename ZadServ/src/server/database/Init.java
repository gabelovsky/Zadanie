package server.database;

import java.sql.SQLException;

public class Init {

	/**
	 * Initialize resources
	 * @param args
	 * 	- no arguments
	 */
	public static void main(String[] args){
		ConnectionManager connMan=new ConnectionManager();
		
		if(!connMan.connect())
			return;
		
		
	}
}

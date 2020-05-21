package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnexion {

	private static String url = "jdbc:derby:test;create=true";
	private static String user = "user";
	private static String passwd = "user";

	private static Connection connect;
	
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connect;	
	}
}

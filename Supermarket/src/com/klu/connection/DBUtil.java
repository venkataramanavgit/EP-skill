package com.klu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	final static String forNameURL="com.mysql.cj.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/KLEF";
	final static String username="root";
	final static String password="ROOT";
	
 
	public static Connection DBConnection() throws SQLException, ClassNotFoundException {
		Class.forName(forNameURL);
		Connection con=DriverManager.getConnection(dBURL,username,password);
	    return con ;
	}
}

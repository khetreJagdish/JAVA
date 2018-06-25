package com.scoopen.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * PreparedStatement
 *
 */
public class PreparedStatementExample {
	public static void main( String[] args ) 
    {
		Connection connection = null;
    	try {
    		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			System.out.println("Connection Successful...");
    	} catch (SQLException e) {
			System.out.println( "Connection failed..." );
			e.printStackTrace();
			return;
		}
    	if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        
    }
}

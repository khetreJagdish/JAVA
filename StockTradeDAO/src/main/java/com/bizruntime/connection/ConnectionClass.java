package com.bizruntime.connection;


import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass 
{
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "system";
	private static final String PASSWORD = "root";

	static 
	{
		try 
		{
			Class.forName(DRIVER);
		}
		catch (ClassNotFoundException ex) 
		{
			ex.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	public static void closeResources(ResultSet rs, Statement stmt, Connection con) {
		try 
		{
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		try 
		{
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		try 
		{
			if (con != null) 
			{
				con.close();
				con = null;
			}
		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
	}
}

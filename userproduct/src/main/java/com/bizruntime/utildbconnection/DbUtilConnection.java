package com.bizruntime.utildbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtilConnection
{
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "system";
	private static final String PASSWORD = "root";
	
	static
	{
		try
		{
			Class.forName(DRIVER);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	public static void closeResources(ResultSet rs, PreparedStatement pstmt, Connection con)
	{
			try
			{
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
				
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		
		
			try
			{
				if(pstmt != null)
				{
					pstmt.close();
					pstmt = null;
				}
				
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			try
			{
				if(con != null)
				{
					con.close();
					pstmt = null;
				}
				
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		
	}
}

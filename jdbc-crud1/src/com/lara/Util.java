package com.lara;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Util 
{
     private static final String DRIVER_CLASS;
     private static final String URL;
     private static final String USERNAME;
     private static final String PASSWORD;
     
     
     	static 
     	{
     		Properties pr = new Properties();
     		FileReader fin = null;
     		
     		try 
     		{
			    	fin = new FileReader("db-constraints.properties");
			    	pr.load(fin);
			}
     		catch (IOException ex) 
     		{
				ex.printStackTrace();
			}
     		finally 
     		{
			      
			 }
			   DRIVER_CLASS = pr.getProperty("driverClass");
			   URL = pr.getProperty("url");
			   USERNAME = pr.getProperty("username");
			   PASSWORD = pr.getProperty("password");
     		}
     	
     	static 
     	{
     		try 
     		{
			    Class.forName(DRIVER_CLASS);	
			} 
     		 catch (ClassNotFoundException ex) 
     		{
				
				ex.printStackTrace();
			}
     	}
     	
     	
     	public static Connection getConnection() throws SQLException 
     	{
			return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
     	
      public static void closeResources(ResultSet rs, Statement stmt, Connection con) 
      {
		if(rs != null)
		{
			try
			{
				rs.close();
				rs = null;
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(stmt != null)
		{
			try 
			{
			    stmt.close();
			    stmt = null;
			} 
			catch (SQLException ex) 
			{
			     ex.printStackTrace();
			}
		}
		
		if(con != null)
		{
			try 
			{
			    con.close();
			    con = null;
			} 
			catch (SQLException ex) 
			{
			     ex.printStackTrace();
			}
		}
	  }
     	
}
    


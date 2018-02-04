package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util 
{
  public static final String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver";
  public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
  public static final String USERNAME ="system";
  public static final String PASSWORD ="root";
	

static
{
  try
  {
	  Class.forName(DRIVER_CLASS);
  }
  catch(ClassNotFoundException ex)
  {
	  ex.printStackTrace();
  }
}

public static Connection getConnection() throws SQLException
{
   return DriverManager.getConnection(URL,USERNAME,PASSWORD);	
}
public static void closeResources(ResultSet rs,Statement stmt,Connection con) 
   {
	   if (rs != null) 
	   {
		try 
		{
		   rs.close();
		   rs =null;
		}
		catch (SQLException ex) 
		{
		ex.printStackTrace();
		}
	}
	   if(stmt != null)
	   {
		   try 
		   {
			stmt.close();
			stmt =null;
		   } 
		   catch (SQLException ex) 
		   {
			   ex.printStackTrace();
		  }
	   }
	   if (con != null) 
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
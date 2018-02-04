// DAO - DATA ACCESS OBJECT
package com.lara;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDAO 
{
   public static int save (int id, 
		   									String name,
		   									int age,
		   									String email) 
   {
	int status = 0;
	StringBuffer sql = new StringBuffer();
	sql.append("insert into person ");
	sql.append("values(");
	sql.append(id+", ");
	sql.append(" ' "+ name + " ',  ");
	sql.append(age + ", ");
	sql.append(" ' "+ email +" ' )");
	
	Connection con = null;
	Statement stmt = null;
	
	try 
	{
	    con = Util.getConnection();
	    stmt = con.createStatement();
	    status =stmt.executeUpdate(sql.toString());
	}
	catch (SQLException ex) 
	{
	   ex.printStackTrace();
	}
	finally 
	{
	    Util.closeResources(null, stmt, con);	
	}
	return status;
   }
   
   
   public static void update(int id, 
			                                          String name,
			                                          int age,
			                                          String email) 
{
	   StringBuffer sql = new StringBuffer();
	   sql.append("update person set  ");
	   sql.append("name= ' " + name + " '  , ");
	   sql.append("age =  " + age + ", ");
	   sql.append("email = ' " + email + " '  ");
	   sql.append("where id =  "+id);
	   
	   Connection con = null;
	   Statement stmt = null;
	   
	   try 
	   {
		   con = Util.getConnection();
		   stmt =con.createStatement();stmt.executeUpdate(sql.toString());
	   }
	   catch (SQLException ex) 
	   {
		  ex.printStackTrace();
	   }
	   finally 
	   {
		   Util.closeResources(null, stmt, con);
	   }
  }
   
   public static void delete(int id) 
   {
	   StringBuffer sql = new StringBuffer();
	   sql.append("delete from person ");
	   sql.append("where id = "+ id);
	   
	   Connection con = null;
	   Statement stmt = null;
	   
	   try 
	   {
		  con = Util.getConnection();
		  stmt= con.createStatement();
		  stmt.executeUpdate(sql.toString());
	    } 
	   catch (SQLException ex) 
	   {
		   ex.printStackTrace();
	   }
	   finally 
	   {
		   Util.closeResources(null, stmt, con);
	   }
    }
   
   public static ArrayList  readAllPersons() 
   {
	      ArrayList list = new ArrayList();
	      String sql = "select * from person";
	      
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	     try 
	     {
		   con = Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql);
		   Object[] row = null;
		   
		   
		   while (rs.next()) 
		   {
			  row = new Object[4];
			  row[0] = rs.getInt("id");
			  row[1] = rs.getString("name");
			  row[2] = rs.getInt("age");
			  row[3] = rs.getString("email");
			  
			  list.add(row);
			  
		    }
		 }
	     catch (SQLException ex) 
	     {
			ex.printStackTrace();
		}
	     finally 
	     {
		      Util.closeResources(rs, stmt, con);	
		 }
	      
	      return list;
   }
   
   public static Object[]  readPersons(int id) 
   {                                                                              // for reading one record only
	      Object[] record = new Object[4];
	      String sql = "select * from person " +
	                           "where id = " + id;
	      
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	     try 
	     {
		   con = Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql);
		   
		   if (rs.next()) 
		   {
			  
			  record[0] = rs.getInt("id");
			  record[1] = rs.getString("name");
			  record[2] = rs.getInt("age");
			  record[3] = rs.getString("email");
			  
		    }
		 }
	     catch (SQLException ex) 
	     {
			ex.printStackTrace();
		}
	     finally 
	     {
		      Util.closeResources(rs, stmt, con);	
		 }
	      
	      return record;
   }
   
   
   public static ArrayList  readAllPersons(String key) 
   {
	      ArrayList list = new ArrayList();
	      StringBuffer sql = new StringBuffer();
	      sql.append("select * from person ");
	     sql.append("where name = '%" + key + "%' ");
	     sql.append("or email like '%" + key + "%'  ");
	     
	     try 
	     {
		        int i = Integer.parseInt(key);
		        sql.append(" or age = "+ key);
		        sql.append(" or id =  " + key);
		 }
	     catch (NumberFormatException ex) 
	     {
		    ex.printStackTrace();     
		 }
	      
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	     try 
	     {
		   con = Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql.toString());
		   Object[] row = null;
		   
		   
		   while (rs.next()) 
		   {
			  row = new Object[4];
			  row[0] = rs.getInt("id");
			  row[1] = rs.getString("name");
			  row[2] = rs.getInt("age");
			  row[3] = rs.getString("email");
			  
			  list.add(row);
			  
		    }
		 }
	     catch (SQLException ex) 
	     {
			ex.printStackTrace();
		}
	     finally 
	     {
		      Util.closeResources(rs, stmt, con);	
		 }
	      
	      return list;
   }
   
   
   
}

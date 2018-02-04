package com.lara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonDAO 
{

	
	public static ArrayList readAllGenders() 
	{
	   ArrayList  list	 = new ArrayList();
	   String sql = "select * from gender ";
	   Connection con = null;
	   Statement stmt = null;
	   ResultSet rs = null;
	   
	   try 
	   {
		   con=Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql);
		   HashMap record = null;
		   while (rs.next()) 
		   {
			 record = new HashMap();
			 record.put("id", rs.getInt("id"));
			 record.put("name", rs.getString("name"));
			 list.add(record);
			
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
	public static ArrayList readAllEducation() 
	{
	   ArrayList  list	 = new ArrayList();
	   String sql = "select * from education ";
	   Connection con = null;
	   Statement stmt = null;
	   ResultSet rs = null;
	   
	   try 
	   {
		   con=Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql);
		   HashMap record = null;
		   while (rs.next()) 
		   {
			 record = new HashMap();
			 record.put("id", rs.getInt("id"));
			 record.put("name", rs.getString("name"));
			 list.add(record);
			
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
	public static ArrayList readAllSkills() 
	{
	   ArrayList  list	 = new ArrayList();
	   String sql = "select * from skill ";
	   Connection con = null;
	   Statement stmt = null;
	   ResultSet rs = null;
	   
	   try 
	   {
		   con=Util.getConnection();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(sql);
		   HashMap record = null;
		   while (rs.next()) 
		   {
			 record = new HashMap();
			 record.put("id", rs.getInt("id"));
			 record.put("name", rs.getString("name"));
			 list.add(record);
			
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
	
	public static void save(HashMap data) 
	{
		Integer id = (Integer) data.get("id");
		String firstName =(String) data.get("firstname");
		Integer age = (Integer) data.get("age");
		Integer genderid = (Integer) data.get("genderid");
		Integer educationId = (Integer) data.get("educationId");
		
		String[] skillId = (String[]) data.get("skillId");
		
		String houseNo = (String) data.get("houseNo");
		String StreetName = (String) data.get("StreetName");
		
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into person values(" );
		sql1.append(id + ", ");
		sql1.append(", ' "+ firstName + " ',");
		sql1.append(age+",");
		sql1.append(genderid +", ");
		sql1.append(educationId+") ");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("insert into address values(" );
		sql2.append( " ' " + houseNo +" ', ");
		sql2.append( " ' " + StreetName +" ', ");
		sql2.append( id+" )");
		
		StringBuffer sql3 = new StringBuffer();
		sql3.append("insert into person_skill values(" );
		sql3.append(id +",  ?)");
		
		Connection con = null;
		Statement stmt1 = null;
		Statement stmt2 = null;
		PreparedStatement pstmt = null;
		
		try 
		{
		   con = Util.getConnection();
		   stmt1 = con.createStatement();
		   stmt2 = con.createStatement();
		   pstmt = con.prepareStatement(sql3.toString());
		   stmt1.executeUpdate(sql1.toString());
		   stmt2.executeUpdate(sql2.toString());
		   
		   for(String s1 : skillId)
		   {
			   pstmt.setInt(1, Integer.parseInt(s1));
			   pstmt.executeUpdate();
		   }
		} catch (SQLException ex) 
		{
		   ex.printStackTrace();
		}
		finally 
		{
		     Util.closeResources(null, stmt1, con);
		     Util.closeResources(null, stmt2, null);
		     Util.closeResources(null, pstmt, null);
		}
		
	}
}

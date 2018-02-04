package com.bizruntime.dbdao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bizruntime.accessxml.Util;
import com.bizrutime.persondata.pojoclasses.Person;

public class DatabaseDAO 
{
	public static void setPerson(List<Person> list) 
	{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try 
		{
			
			
			for(Person personlist : list)
			{
				
			
			String sql = "insert into Person(Pan, firstName, lastName, age, phone) values (?,?,?,?,?)";
			
			con = Util.getConnection();
			
			System.out.println(con);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, personlist.getPan());
			pstmt.setString(2, personlist.getFirstname());
			pstmt.setString(3, personlist.getLastname());
			pstmt.setInt(4, personlist.getAge());
			pstmt.setLong(5, personlist.getPhone());
			pstmt.executeUpdate();
			System.out.println(rs + "recors updated");
			System.out.println("records.........................");
		}
			
			
			
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
	}
}

package com.bizruntime.daoclasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bizruntime.userproductpojo.Product;
import com.bizruntime.userproductpojo.User;
import com.bizruntime.utildbconnection.DbUtilConnection;

public class UserProductDBDAOImpl
{
	public void insertProduct(Product prod)
	{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			String insert = "INSERT INTO PRODUCT "+ "(ProductID ,ProductName,  ProductCategory, price) VALUES" + "( ?, ?, ?, ?)";
			con = DbUtilConnection.getConnection();
			pstmt = con.prepareStatement(insert);
			
			pstmt.setString(1, prod.getProductId());
			pstmt.setString(2, prod.getProductName());
			pstmt.setString(3, prod.getProductCategory());
			pstmt.setDouble(4, prod.getPrice());
			
			int affectedRows = pstmt.executeUpdate();
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
		        if (con != null && !con.isClosed())
		            {
		        		con.close();
		        		
		             }
		        }
		    catch (SQLException e) 
		    {
		        e.printStackTrace();
		    }
			
		}
		System.out.println("insertion done");
	}
		
}

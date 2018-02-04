package com.bizruntime.stocktrdedao;
import com.bizruntime.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bizruntime.CSVFileNotFoundException;
import com.bizruntime.DateFormatException;
import com.bizruntime.DateParseException;
import com.bizruntime.FileReaderException;
import com.bizruntime.IStockTradeReaderDAO;
import com.bizruntime.InputException;
import com.bizruntime.SQLQueryException;
import com.bizruntime.StockTrade;
import com.bizruntime.StockTradeReader;

/*
 * /**
* <h1>StockTradeDAOImpl</h1>
* is a IStockTradeReaderDAO Interface class   
* simple performing Data Access Object Operation on getting Data from DataBase
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/

public class StockTradeDAOImpl implements IStockTradeReaderDAO 
{

	SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
	StockTradeReader sd = new StockTradeReader();
	
	public void insertData(StockTrade s) throws InterruptedException, SQLException, SQLQueryException
	{

		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			String insert = "INSERT INTO STOCKTRADET"
					+ "(securitytr,mydate, opentr, hightr, lowtr, closetr, volumetr,Adjtr) VALUES" + "(?,?,?,?, ?, ?, ?, ?)";
			con = ConnectionClass.getConnection();

			pstmt = con.prepareStatement(insert);

			pstmt.setString(1, s.getSecurity());
			Date udate=s.getDate();
			java.sql.Date sdate=new java.sql.Date(udate.getTime());
			pstmt.setDate(2, sdate);
			pstmt.setDouble(3, s.getOpen());
			pstmt.setDouble(4, s.getHigh());
			pstmt.setDouble(5, s.getLow());
			pstmt.setDouble(6, s.getClose());
			pstmt.setDouble(7, s.getVolume());
			pstmt.setDouble(8, s.getAdjclose());

			int rs = pstmt.executeUpdate();

			 System.out.println("connected to database");
			 
			 con.commit();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			//throw new SQLQueryException("check sql command ", e);
		}
		finally 
		{
			try {
		        if (con != null && !con.isClosed())
		            {
		        		con.close();
		        		//Thread.sleep(1000);
		    			
		             }
		        }
		    catch (SQLException e) 
		    {
		        e.printStackTrace();
		    }
			
		}
		System.out.println("insertion done");
		
	}

	public List<StockTrade> readStockDatabase() throws SQLException, SQLQueryException
	{

		List<StockTrade> list = new ArrayList<>();
		StockTrade s = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			String sql = "SELECT * FROM stocktradet";
			con = ConnectionClass.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				s = new StockTrade();
				
				s.setSecurity(rs.getString(1));
				s.setDate(rs.getDate(2));
				s.setOpen(rs.getDouble(3));
				s.setHigh(rs.getDouble(4));
				s.setLow(rs.getDouble(5));
				s.setClose(rs.getDouble(6));
				s.setVolume(rs.getDouble(7));
				s.setAdjclose(rs.getDouble(8));

				list.add(s);
				con.commit();
				
			}
		
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			//throw new SQLQueryException("check sql query ..." ,ex);
		}
		finally
		{
			ConnectionClass.closeResources(rs,pstmt, con);
		}
		
		return list;
	}
	
	public StockTrade  getMaxVolumeTrade(List<StockTrade> list) 
	{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StockTrade stk = new StockTrade();
		
		
		try
		{
			String sql = "SELECT volumetr FROM stocktradet WHERE volumetr = (SELECT MAX(volumetr) FROM stocktradet)";	
			con = ConnectionClass.getConnection();
			pstmt = con.prepareStatement(sql);
			
			rs  =  pstmt.executeQuery();
			
			while (rs.next())
			{
				//System.out.println(rs.getDouble(1));
				stk.setVolume(rs.getDouble(1));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
                if (con != null && !con.isClosed())
                    {
                    con.close();
                    //Thread.sleep(1000);
                     }
                }
            catch (SQLException e) {
                e.printStackTrace();}
			//ConnectionClass.closeResources(rs, pstmt, con);
		}	
		
		return stk;
	}
	
	
	public StockTrade getMinVolumeTrade(List<StockTrade> list) throws SQLQueryException  
	{
		System.out.println(list);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StockTrade stk = new StockTrade();
		
		
		try
		{
			System.out.println("inside try");
			String sql = "SELECT volumetr FROM stocktradet WHERE volumetr = (SELECT MIN(volumetr) FROM stocktradet)";	
			con = ConnectionClass.getConnection();
			pstmt = con.prepareStatement(sql);
			
			rs  =  pstmt.executeQuery();
	
			while (rs.next())
			{
				stk.setAdjclose(rs.getDouble(1));
			}
			System.out.println("end of min");
		} 
		catch (SQLException e)
		{
			throw new SQLQueryException("SQL query is not wrong", e);
		}
		finally 
		{
			ConnectionClass.closeResources(rs, pstmt, con);
		}	
		
		return stk;
	}
		
	
	

	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade>list) throws SQLQueryException 
	{
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		StockTrade stk = new StockTrade();
		
		Map<Date,Double> map = new HashMap<>();
		try
		{	
			
			String sql = "SELECT (MAX(opentr) -MAX(hightr)) AS difference FROM stocktradet";
			con = ConnectionClass.getConnection();
			pstmt = con.prepareStatement(sql);
			rs  =  pstmt.executeQuery();
			double d= 0.0;
			while(rs.next())
			{
				
				java.sql.Date sdate=new java.sql.Date(stk.getDate().getTime());
				DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
				Date dateobj = new Date();
				map.put(sdate,d);
			}
			
		} 

		catch(SQLException e)
		{
			e.printStackTrace();
			//	throw new SQLQueryException("sql query Exception is occured", e);
		}
		finally
		{
			ConnectionClass.closeResources(rs, pstmt, con);
		}
		
		return map;
	}
	
	public static void main(String[] args) throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException
	{
		StockTradeDAOImpl st = new StockTradeDAOImpl();
		StockTradeReader stk = new StockTradeReader();
		List<StockTrade> list = stk.readStockTrades();
		 st.getMaxVolumeTrade(list);
		
	}
	
}

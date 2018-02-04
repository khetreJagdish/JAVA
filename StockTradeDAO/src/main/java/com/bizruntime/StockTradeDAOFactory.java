package com.bizruntime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.bizruntime.stocktrdedao.StockTradeDAOImpl;
/**
 * <h1><StockTradeDAOFactory</h1> is a Factory class which reads properties file and 
 * based on that it will return object of appropriate Database DAO implementation class
 * or CSV reader class.
 * 
 * @author JK
* @version 1.0
* @since   2016-11-8 
 * */
public class StockTradeDAOFactory
{
	 
	public static IStockTradeReaderDAO  getDAO() throws InputOutputException
	{
		Properties prop = new Properties();
		FileInputStream fis = null;
		IStockTradeReaderDAO dao = null;
		String dbtype=null;
		try
		{
				
			
			fis = new FileInputStream("src/main/resources/configuration.properties");
			prop.load(fis);			
			dbtype=prop.getProperty("DBType");
			System.out.println(dbtype);
			//System.out.println(prop.getProperty("DBType_csv"));
	        //System.out.println(prop.getProperty("DBType_db"));
		
		
		
		} 
		catch (IOException e)
		{
			
			throw new InputOutputException("InputOutput Exception Occurred", e);
		}
		
		if("CSV".equalsIgnoreCase(dbtype))
		{
			dao= new StockTradeCSVDAOImpl();
		}
		else if("DB".equalsIgnoreCase(dbtype))
		{
			//System.out.println(dbtype);
			dao = new StockTradeDAOImpl();
		}
		else
		{
			
		}
		return dao;
	}
	
	
	public static void main(String[] args) throws InputOutputException
	{
		StockTradeDAOFactory.getDAO();
	}
}

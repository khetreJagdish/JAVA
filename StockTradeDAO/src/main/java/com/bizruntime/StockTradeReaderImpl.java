package com.bizruntime;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bizruntime.stocktrdedao.StockTradeDAOImpl;
/**
 * <h1>StockTradeReaderImpl</h1> is an class which implements
 * <h1>IStockTradeReader</h1> interface and it is applying 
 * 
 * <h1>Runtime Polymorphism</h1> to call DAO classes.
 * 
 * @author JK
* @version 1.0
* @since   2016-11-07
 * */
public class StockTradeReaderImpl implements IStockTradeReader
{
	
	public StockTrade getMaxVolumeTrade(List<StockTrade> list) throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException 
	{
		StockTrade stk = null;
		IStockTradeReaderDAO dao = null;
		try
		{
			StockTradeReader sd = new StockTradeReader();
			List<StockTrade> list1 = sd.readStockTrades();
			dao = StockTradeDAOFactory.getDAO();
			stk = dao.getMaxVolumeTrade(list1);
		} 
		catch(InputOutputException e)
		{
			e.printStackTrace();
		}
		
		return stk;
	}
	
	public StockTrade getMinVolumeTrade(List<StockTrade> list) throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException 
	{
		
		StockTrade st = null;
		StockTradeReaderImpl dao =null;
		try
		{
			 
			StockTradeReader sd = new StockTradeReader();
			List<StockTrade> list1 = sd.readStockTrades();
			 st = dao.getMinVolumeTrade(list1);
		} catch (NumberFormatException e)
		{
			throw new NumberFormaterException("Number format exception occurred" , e);
		}
		
		return st;
	}
	
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade>list) throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException
	{
		Map<Date, Double> mapobject = null;
		try
		{	
			StockTradeReaderImpl dao = new StockTradeReaderImpl();
			StockTradeReader sd = new StockTradeReader();
			List<StockTrade> list1 = sd.readStockTrades();
			 mapobject = dao.getDailyTradingDifferential(list1);
		} 
		catch (NumberFormatException e)
		{
			throw new NumberFormaterException("Number format exception occurred", e);
		}
		
		return mapobject;
	}
	


}

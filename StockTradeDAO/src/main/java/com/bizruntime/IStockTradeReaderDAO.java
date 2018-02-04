package com.bizruntime;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;	 
/**
* <h1>IStockTradeReader</h1>
* IStockTradeReader is a Interface  
* which contains  public , abstract methods.
* 
* @author JK
* @version 1.0
* @since   2016-11-7
*/
public interface IStockTradeReaderDAO
{
	
	       public void insertData(StockTrade s) throws StockTradeInValidFormatException, CSVFileNotFoundException, InterruptedException, SQLException, SQLQueryException,InputOutputException;
			public StockTrade getMaxVolumeTrade(List<StockTrade> list) throws SQLQueryException,InputOutputException;
			
			public StockTrade getMinVolumeTrade(List<StockTrade> list) throws SQLQueryException;
			
			public Map<Date,Double> getDailyTradingDifferential(List<StockTrade>list) throws SQLQueryException;
	

}

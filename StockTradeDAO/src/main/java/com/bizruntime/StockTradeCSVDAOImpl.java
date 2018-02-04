package com.bizruntime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bizruntime.connection.ConnectionClass;
/**
 *  <h1>StockTradeCSVDAOImpl</h1> is an implementation DAO class for  
 * Implementing CSVreader Logic from CSV file.
 * */
public class StockTradeCSVDAOImpl implements  IStockTradeReaderDAO
{
	public StockTrade  getMaxVolumeTrade(List<StockTrade> list) 
	{
		Double maxVolume = list.get(0).getVolume();
		StockTrade stock = new StockTrade();
		stock = list.get(0);
		for (StockTrade l : list)
		{
			if (l.getVolume() > maxVolume)
			{
				maxVolume = l.getVolume();
				stock = l;
			}
		}
		System.out.println(stock);
		return stock;
	}	
	
	public StockTrade getMinVolumeTrade(List<StockTrade> lst)
	{
		Double minVolume = lst.get(0).getVolume();
		StockTrade stock = new StockTrade();
		stock = lst.get(0);
		for (StockTrade l : lst)
		{

			if (l.getVolume() < minVolume)
			{
				minVolume = l.getVolume();
				stock = l;
			}
		}
		return stock;

	}
	public void insertData(StockTrade s) 
	 {
		 List<StockTrade> stk = new ArrayList<>();
		 stk.add(s);
	 }
	 
	 
	 
	 
	 public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> list)
		{
			Map<Date, Double> map = new HashMap<Date, Double>();
			
			for (StockTrade stock : list)
			{
				map.put(stock.getDate(), stock.getHigh() - stock.getOpen());
			}
			return map;
		}
	 
}

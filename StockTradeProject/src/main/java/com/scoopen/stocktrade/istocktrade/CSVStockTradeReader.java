package com.scoopen.stocktrade.istocktrade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.scoopen.stocktrade.exceptions.CSVFileNotFoundException;
import com.scoopen.stocktrade.exceptions.StockTradeInValidFormatException;
import com.scoopen.stocktrade.pojo.StockTrade;

public class CSVStockTradeReader implements IStockTradeReader {

	static Logger logger = Logger.getLogger(CSVStockTradeReader.class);

	public List<StockTrade> readStockTrades()
			throws StockTradeInValidFormatException, DateFormatException, CSVFileNotFoundException, IOException {

		logger.info("File is Reading...");
		String csvFile = "src/main/resources/CISCO.csv";
		BufferedReader bufferedReader = null;
		String line = "";
		Boolean flag = true;
		List<StockTrade> stockTradesList = new ArrayList<StockTrade>();
		String csvSplitBy = " , ";

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

		try {
			bufferedReader = new BufferedReader(new FileReader(csvFile));

			while ((line = bufferedReader.readLine()) != null)
			{
				
				if (flag)
					try
					{
						{
							
							String[] stocktrade = line.split(csvSplitBy);
							

							StockTrade stockTradeList = new StockTrade();
							stockTradeList.setSecurity(stocktrade[0]);
							
							try
		                	{
		                		
		                	Date date = format.parse(stocktrade[1]);
		                	stockTradeList.setDate(date);
		                	}
		                	catch (ParseException e) 
							{
		                        throw new DateFormatException("date format is in correct",e);
		                    }
							
							
							stockTradeList.setOpen(Double.parseDouble(stocktrade[2]));
							stockTradeList.setHigh(Double.parseDouble(stocktrade[3]));
							stockTradeList.setLow(Double.parseDouble(stocktrade[4]));
							stockTradeList.setClose(Double.parseDouble(stocktrade[5]));
							stockTradeList.setVolume(Double.parseDouble(stocktrade[6]));
							stockTradeList.setAdjClose(Double.parseDouble(stocktrade[7]));
							
							
							
						}
						
					}

					catch (NumberFormatException e)
					{
						
						throw new DateFormatException("wrong date", e);					
					}
					
			}
			flag = true;
			

		} 
		
		catch (IOException e2)
		{
			throw new StockTradeInValidFormatException("Stock trade format is invalid", e2);
		}

		finally
		{
			if (bufferedReader != null)
			{
				try
				{
					bufferedReader.close();
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		return stockTradesList;
	}

	public StockTrade getMaxVolumeTrade(List<StockTrade> lst)
	{
		
		System.out.println("ist="+lst);
		Double maxVolume = lst.get(0).getVolume();
		//Double maxVolume = 0.0;
		StockTrade stock = new StockTrade();
		stock = lst.get(0);
		for (StockTrade l : lst)
		{
			if (l.getVolume() > maxVolume)
			{
				maxVolume = l.getVolume();
				stock = l;
			}
		}
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


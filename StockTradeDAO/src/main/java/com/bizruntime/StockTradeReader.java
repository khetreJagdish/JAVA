package com.bizruntime;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bizruntime.stocktrdedao.StockTradeDAOImpl;

/**
 * <h1>CSVStockTradeReader</h1> CSVStockTradeReader is a simple class which
 * reads the trade from CSV file
 *
 * @author JK
 * @version 1.0
 * @since 2016-11-7
 * 
 */

public class StockTradeReader
{
	
	static final String STOCKFILE = "src/main/resources/CISCO.csv";
	static final String STOCKFILESPLITBY = ",";
	
	public List<StockTrade> readStockTrades() throws CSVFileNotFoundException,InputException, DateParseException, InterruptedException, SQLException, ParseException, NumberFormatException, SQLQueryException, FileReaderException
	{	
		List<StockTrade>  list = new ArrayList<StockTrade>();
		SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");

		BufferedReader brreader = null;
		String line ="";
		
		Boolean flag = true;
		try
		{
			brreader = new BufferedReader(new FileReader(STOCKFILE));
			String s1 = brreader.readLine();
			
			StockTradeDAOImpl dao = new StockTradeDAOImpl();
			
			while ((line = brreader.readLine()) != null)
			{
				String[] stocktrade = line.split(STOCKFILESPLITBY);
				StockTrade s = new StockTrade();
				
				s.setSecurity(stocktrade[0]);
				Date date  = dateformat.parse(stocktrade[1]);
				s.setDate((date));
				s.setOpen(Double.parseDouble(stocktrade[2]));
				s.setHigh(Double.parseDouble(stocktrade[3]));
				s.setLow(Double.parseDouble(stocktrade[4]));
				s.setClose(Double.parseDouble(stocktrade[5]));
				s.setVolume(Double.parseDouble(stocktrade[6]));
				s.setAdjclose(Double.parseDouble(stocktrade[7]));
				
				list.add(s);
				dao.insertData(s);
			}
		}
		catch (IOException e)
		{
			throw new CSVFileNotFoundException("File is not Found at Location ", e);
		}
		flag = false;
		return list;
		
	}
	
	
	
	
}


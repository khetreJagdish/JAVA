package com.scoopen.stocktrade.istocktrade;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.scoopen.stocktrade.exceptions.CSVFileNotFoundException;
import com.scoopen.stocktrade.exceptions.StockTradeInValidFormatException;
import com.scoopen.stocktrade.pojo.StockTrade;
public interface IStockTradeReader {
	
	
		public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException, DateFormatException, FileNotFoundException, CSVFileNotFoundException, IOException;
		
		public StockTrade getMaxVolumeTrade(List<StockTrade> getMaxVol);
	
		public StockTrade getMinVolumeTrade(List<StockTrade> getMinVal);
		
		public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> getDailyTradings);
}

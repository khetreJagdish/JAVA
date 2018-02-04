package com.bizruntime;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IStockTradeReader
{
	public StockTrade getMaxVolumeTrade(List<StockTrade> list) throws  CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException, InputOutputException, InterruptionException;
	public StockTrade getMinVolumeTrade(List<StockTrade> list) throws  CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException ;
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade>list) throws  CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, NumberFormaterException;
}

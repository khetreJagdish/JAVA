package com.bizruntime.test;
import com.bizruntime.CSVFileNotFoundException;
import com.bizruntime.DateParseException;
import com.bizruntime.FileReaderException;
import com.bizruntime.IStockTradeReaderDAO;
import com.bizruntime.InputException;
import com.bizruntime.InputOutputException;
import com.bizruntime.SQLQueryException;
import com.bizruntime.StockTrade;
import com.bizruntime.StockTradeCSVDAOImpl;
import com.bizruntime.StockTradeReader;
import com.bizruntime.stocktrdedao.StockTradeDAOImpl;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.*;

public class StockTradeCSVDAOImplTest
{
	
	static StockTradeReader stock = new StockTradeReader();
	
	@Before
	public void beforeTest()
	{
		System.out.println("Befre Test");
	}
	
	@Test
	public void  getMaxVolumeTradeTest() throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException, InputOutputException
	{
		List<StockTrade> list1 = stock.readStockTrades();
		StockTradeCSVDAOImpl st = new StockTradeCSVDAOImpl();
		StockTrade stk = st.getMaxVolumeTrade(list1);
		assertEquals(list1, stk);
	}
	@Test
	public void  getMinVolumeTradeTest() throws NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, SQLException, ParseException, SQLQueryException, FileReaderException
	{
		List<StockTrade> list1 = stock.readStockTrades();
		StockTradeCSVDAOImpl st = new StockTradeCSVDAOImpl();
		StockTrade minVolumeTrade = st.getMinVolumeTrade(list1);
		assertEquals(list1, minVolumeTrade);
	}
	@Test
	public void getDailyTradingDifferentialTest() throws SQLException, SQLQueryException, NumberFormatException, CSVFileNotFoundException, InputException, DateParseException, InterruptedException, ParseException, FileReaderException
    {
		List<StockTrade> list1 = stock.readStockTrades();
		StockTradeCSVDAOImpl st = new StockTradeCSVDAOImpl();
		Map<Date, Double> stk = st.getDailyTradingDifferential(list1);
		assertEquals(list1, stk);
    }
	
	@After
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
}

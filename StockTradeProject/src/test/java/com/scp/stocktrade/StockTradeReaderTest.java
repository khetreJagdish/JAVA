package com.scp.stocktrade;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.scoopen.stocktrade.exceptions.CSVFileNotFoundException;
import com.scoopen.stocktrade.exceptions.StockTradeInValidFormatException;
import com.scoopen.stocktrade.istocktrade.CSVStockTradeReader;
import com.scoopen.stocktrade.istocktrade.DateFormatException;

public class StockTradeReaderTest{
	
	Logger logger = Logger.getLogger(StockTradeReaderTest.class);
	
	@BeforeClass
	   public void oneTimeSetUp() {
	      logger.info("@BeforeClass - oneTimeSetUp");
	   }	
	
	 @AfterClass
	   public void oneTimeTearDown() {
	      System.out.println("@AfterClass - oneTimeTearDown");
	   }
	 
	 @BeforeMethod
	 public void readStockTradesTest() throws StockTradeInValidFormatException, DateFormatException, CSVFileNotFoundException, IOException {
		 
		 CSVStockTradeReader csvStockTradeReader = new CSVStockTradeReader();
		 csvStockTradeReader.readStockTrades();
		 Assert.assertEquals("List successfull", "List is not successfull");
	 }
}

package com.bizruntime.test;

import static org.junit.Assert.*;

import java.sql.SQLException;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.bizruntime.stocktrdedao.*;
import com.bizruntime.SQLQueryException;
import com.bizruntime.StockTrade;


public class SimpleTest
{
         @Test
         public void getMaxVolumeTradeTest() throws SQLException, SQLQueryException
		{
        	 
        	 StockTradeDAOImpl sd = new StockTradeDAOImpl();
        	 List<StockTrade> list1 =sd.readStockDatabase();
        	 StockTrade s = sd.getMaxVolumeTrade(list1);
        	 assertEquals( s, list1 );

		}
      @Test
         public void getMinVolumeTradeTest()throws SQLException, SQLQueryException
 		{
         	 
         	 StockTradeDAOImpl sd = new StockTradeDAOImpl();
         	 List<StockTrade> list1 =sd.readStockDatabase();
         	 StockTrade s = sd.getMinVolumeTrade(list1);
         	assertEquals(list1, s);

 		}
         @Test
         public void getDailyTradingDifferentialTest() throws SQLException, SQLQueryException
         {
        	 System.out.println("inside get daily test");
        	 StockTradeDAOImpl sd = new StockTradeDAOImpl();
        	 List<StockTrade> list1 =sd.readStockDatabase();
        	 System.out.println(" it is list : "+ list1);
        	// Map<Date, Double> mapobjecttest = sd.getDailyTradingDifferential(list1);
         }
}

package com.bizruntime;
/**
* <h1>StockTradeInValidFormatException</h1>
*  is an Exception class 
* which throws Exception about Valid Invallid Format Exception
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/

public class StockTradeInValidFormatException extends Exception
{
	public StockTradeInValidFormatException(String expMsg, Throwable e)
	{
		super(expMsg);
	}
}

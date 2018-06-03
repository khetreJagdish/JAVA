package com.scoopen.stocktrade.exceptions;

import java.io.IOException;

public class StockTradeInValidFormatException extends Exception{

	public StockTradeInValidFormatException(String message, Throwable e2) {
		super(message, e2);
	}

}

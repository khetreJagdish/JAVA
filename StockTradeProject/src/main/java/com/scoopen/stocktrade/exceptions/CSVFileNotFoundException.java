package com.scoopen.stocktrade.exceptions;

public class CSVFileNotFoundException extends Exception {
	
	public CSVFileNotFoundException(String message , Throwable e) {
		
		super(message , e);
	}
}

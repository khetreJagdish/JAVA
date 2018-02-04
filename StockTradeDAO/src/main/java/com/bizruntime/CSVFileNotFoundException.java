package com.bizruntime;

import java.io.IOException;
/**
* <h1>CSVFileNotFoundException</h1>
*  is an Exception class 
* which throws Exception about FileNotFound
* 
* @author JK
* @version 1.0
* @since   2016-10-20
*/
public class CSVFileNotFoundException extends Exception
{
	public CSVFileNotFoundException(String expMsg, Throwable e)
	{
		super(expMsg);
	}
}

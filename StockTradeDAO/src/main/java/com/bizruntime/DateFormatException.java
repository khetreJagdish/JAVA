package com.bizruntime;

import java.text.ParseException;
/**
* <h1>DateFormatException</h1>
*  is an Exception class which throws Exception about Date Format
* 
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/
public class DateFormatException extends Exception
{

	public DateFormatException(String expMsg, Throwable e)
	{
		super(expMsg);
	}
	
}

package com.bizruntime;

import java.text.ParseException;
/**
* <h1>DateParseException</h1>
*  is an Exception class which throws Exception about Date Parser Exception
* 
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/
public class DateParseException extends Exception
{

	public DateParseException(String expMessage, Throwable e)
	{
		super(expMessage);
	}
}

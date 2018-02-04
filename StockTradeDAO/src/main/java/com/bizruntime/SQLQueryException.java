package com.bizruntime;

import java.sql.SQLException;
/**
* <h1>SQLQueryException</h1>
* SQLQueryException is an Exception class 
* which throws Exception about SQL Query
* 
* @author JK
* @version 1.0
* @since   2016-10-20
*/
public class SQLQueryException extends Exception
{

	public SQLQueryException(String expMsg, Throwable e)
	{
		super(expMsg);
	}

}

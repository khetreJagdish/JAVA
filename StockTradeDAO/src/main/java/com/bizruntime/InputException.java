package com.bizruntime;
/**
* <h1>InputException</h1>
* InputException is an Exception class 
* which throws Exception about SQL Query
* 
* @author JK
* @version 1.0
* @since   2016-10-20
*/
public class InputException extends Exception
{
	public InputException(String expMsg , Throwable e)
	{
		super(expMsg);
	}
}

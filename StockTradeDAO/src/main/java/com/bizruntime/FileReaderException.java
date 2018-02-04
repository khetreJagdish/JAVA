package com.bizruntime;

import java.io.FileNotFoundException;
/**
* <h1>FileReaderException</h1>
*  is an Exception class which throws File Reader Exception 
* 
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/
public class FileReaderException extends Exception
{

	public FileReaderException(String expMsg, FileNotFoundException e)
	{
		super(expMsg);
	}

}

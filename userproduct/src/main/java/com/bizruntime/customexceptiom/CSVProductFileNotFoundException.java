package com.bizruntime.customexceptiom;

import java.io.FileNotFoundException;

public class CSVProductFileNotFoundException extends Exception
{

	public CSVProductFileNotFoundException(String expMsg, Throwable e)
	{
		super(expMsg);
	}

}

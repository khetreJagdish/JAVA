package com.bizruntime.customexceptiom;

import java.io.FileNotFoundException;

public class UserFileNotFoundException extends Exception
{

	public UserFileNotFoundException(String expMsg, Throwable e)
	{
		super(expMsg);
	}

}

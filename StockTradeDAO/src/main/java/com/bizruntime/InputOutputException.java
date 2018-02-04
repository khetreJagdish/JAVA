package com.bizruntime;

import java.io.IOException;

public class InputOutputException extends Exception
{


	public InputOutputException(String expMsg,Throwable e)
	{
		super(expMsg);
	}

}

package com.bizruntime;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
 
/**
* <h1>StockTrade</h1>
* StockTrade is a simple pojo class which holds a StackTrade
* 
* @author JK
* @version 1.0
* @since   2016-11-07
*/
public class StockTrade 
{
	private String Security;
	private Date date;
	private Double Open;
	private Double High;
	private Double Low;
	private Double Close;
	private Double Volume;
	private Double AdjClose;
	
	
	public String getSecurity()
	{
		return  Security;
	}


	public void setSecurity(String security)
	{
		this.Security = security;
	}


	public Date getDate()
	{
		return date;
	}


	public void setDate(Date data)
	{
		this.date = data;
	}


	public Double getOpen()
	{
		return Open;
	}


	public void setOpen(Double open)
	{
		this.Open = open;
	}


	public Double getHigh()
	{
		return High;
	}


	public void setHigh(Double high)
	{
		this.High = high;
	}


	public Double getLow()
	{
		return Low;
	}


	public void setLow(Double low)
	{
		this.Low = low;
	}


	public Double getClose()
	{
		return Close;
	}


	public void setClose(Double close)
	{
		this.Close = close;
	}


	public Double getVolume()
	{
		return Volume;
	}


	public void setVolume(Double volume)
	{
		this.Volume = volume;
	}


	public Double getAdjclose()
	{
		return AdjClose;
	}


	public void setAdjclose(Double adjClose)
	{
		this.AdjClose = adjClose;
	}
	@Override
	public String toString()
	{
	
		return "(" + Security + " ,"+ date + " ," + Open +"," + High + ","+ Low + ","+ Close + "," + Volume + "," +AdjClose +"/n";
	}
	
}

	

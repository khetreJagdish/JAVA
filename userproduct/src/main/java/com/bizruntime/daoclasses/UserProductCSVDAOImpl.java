package com.bizruntime.daoclasses;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import com.bizruntime.customexceptiom.CSVProductFileInVallidFormatException;
import com.bizruntime.customexceptiom.CSVProductFileNotFoundException;
import com.bizruntime.customexceptiom.InputOutputException;
import com.bizruntime.customexceptiom.UserFileNotFoundException;
import com.bizruntime.readuserproduct.ProductCSVReader;
import com.bizruntime.readuserproduct.UserCSVReader;
import com.bizruntime.userproductpojo.Product;
import com.bizruntime.userproductpojo.User;

public class UserProductCSVDAOImpl implements IUserProductDAO
{
	public List<User> getAllUsers() throws UserFileNotFoundException, InputOutputException
	{
		List<User> userlist = null;
		UserCSVReader ur = new UserCSVReader();
		try
		{
			userlist = ur.getAllUsers();
		} 
		catch (IOException e)
		{
			throw new InputOutputException("InputOutputException is occured ", e);
		}
		return userlist;
	}
	
	public List<Product> getAllProducts() throws  CSVProductFileNotFoundException, CSVProductFileInVallidFormatException, InputOutputException
	{
		List<Product> prodlist = null;
		ProductCSVReader prcsvreader = new ProductCSVReader();
		
		try
		{
			prodlist = prcsvreader.getAllProduct();
		}
		catch (IOException|NumberFormatException e)
		{
			throw new InputOutputException("InputOutputException occurred in Productcsv file", e);
		}
		return prodlist;
	}
	
	public List<Product> getAllProductForUser(String userId)
	{
		return null;
		
	}
	public void insertUser(List<User> list)
	{
		
	}
	
}

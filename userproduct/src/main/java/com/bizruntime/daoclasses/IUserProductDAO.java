package com.bizruntime.daoclasses;
import java.io.IOException;
import java.util.List;

import com.bizruntime.customexceptiom.CSVProductFileInVallidFormatException;
import com.bizruntime.customexceptiom.CSVProductFileNotFoundException;
import com.bizruntime.customexceptiom.InputOutputException;
import com.bizruntime.customexceptiom.UserFileNotFoundException;
import com.bizruntime.userproductpojo.*;

public interface IUserProductDAO
{
	public void insertUser(User us);
	public void insertProduct(Product  prod);
	public List<User> getAllUsers() throws UserFileNotFoundException, InputOutputException;
	public List<Product> getAllProducts() throws CSVProductFileNotFoundException, CSVProductFileInVallidFormatException, InputOutputException;
	public List<Product> getAllProductForUser(String userId);
	public List<Product> getAllProductForUserForCategory(String userId,String productCategory);
}

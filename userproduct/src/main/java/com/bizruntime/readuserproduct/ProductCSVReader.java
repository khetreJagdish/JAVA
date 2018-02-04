package com.bizruntime.readuserproduct;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bizruntime.customexceptiom.CSVProductFileInVallidFormatException;
import com.bizruntime.customexceptiom.CSVProductFileNotFoundException;
import com.bizruntime.userproductpojo.Product;

/**
 * <h1>ProductCSVReader </h1> ProductCSVReader  is a simple class which
 * simply reads All the ProductData from ProductCSV file.
 * By using  the method getAllProduct() and return it as a List of Product object.
 *
 * @author JK
 * @version 1.0
 * @since 2016-11-08
 * 
 */

public class ProductCSVReader 
{
	public static final String PRODUCTCSVFILE ="src/main/resources/Product.csv";
	final String SPLITBY =",";
	
	//this method reads all the product from the product CSV file and return it as a List of Product object

	
	public List<Product> getAllProduct() throws CSVProductFileNotFoundException, CSVProductFileInVallidFormatException, NumberFormatException, IOException 
	{
		BufferedReader bufferreader = null;
		String line = "";

		List<Product> lst1 = new ArrayList<Product>();
		
		try 
		{
			 bufferreader = new BufferedReader(new FileReader(PRODUCTCSVFILE));
			 String s2 =bufferreader.readLine();
			 
			 while ((line = bufferreader.readLine()) != null) 
			 {
				 String[] productdata = line.split(SPLITBY);
					 Product prod = new Product();
					 
					 prod.setProductId(productdata[0]);
					 prod.setProductName(productdata[1]);
					 prod.setProductCategory(productdata[2]);
					 prod.setPrice(Double.parseDouble(productdata[3]));
					 prod.setAvailableCity(Arrays.asList(productdata[4]));
					lst1.add(prod);
				
				}
			 System.out.println(lst1);
				 
				
		
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e) 
		{
			throw new CSVProductFileNotFoundException("CSVProductFile is not found in desired location ", e);
		}
		
		finally
		{
			if (bufferreader != null)
			{
				try
				{
					bufferreader.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		
		}
		
		return lst1;

    }
	
	
}


package com.bizruntime.userproductpojo;

import java.util.List;

/**
 * <h1>Product</h1> Product is a simple pojo class which
 * simply defines setter and getter methods 
 * 
 * @author JK
 * @version 1.0
 * @since 2016-11-8
 * 
 */


public class Product 
{
	private String ProductName;
	private String productCategory;
	private Double Price;
	private List<String> availableCity;
	private String productId;
	
	//getter and setter Methods
	
	public List<String> getAvailableCity() 
	{
		return availableCity;
	}

	public void setAvailableCity(List<String> availableCity) 
	{
		this.availableCity = availableCity;
	}

	public String getProductId() 
	{
		return productId;
	}

	public void setProductId(String productId) 
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return ProductName;
	}

	public void setProductName(String productName) 
	{
		this.ProductName = productName;
	}

	public String getProductCategory() 
	{
		return productCategory;
	}

	public void setProductCategory(String productCategory) 
	{
		this.productCategory = productCategory;
	}

	public Double getPrice() 
	{
		return Price;
	}

	public void setPrice(Double price) 
	{
		this.Price = price;
	}

	
	
	@Override
	public String toString() 
	{
		return "(" + ProductName + ", " + productCategory + " , "+ productId + ", " +Price +" , "+ availableCity+")" ;
	}

}

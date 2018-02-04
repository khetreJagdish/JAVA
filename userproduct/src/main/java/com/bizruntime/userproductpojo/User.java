package com.bizruntime.userproductpojo;
/**
 * <h1>User</h1> 
 * User is a simple pojo class which
 * simply defines setter and getter methods 
 * 
 * @author JK
 * @version 1.0
 * @since 2016-11-8
 * 
 */

public class User
{
	private String userName;
	private String email;
	private String phoneNumber;
	private String city;
	private String userId;
	
	
	//getter and setter Methods
	
	public String getUserId() 
	{
		return userId;
	}
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	@Override
	public String toString() 
	{
		
		return "(" + userName + ", " + email + "," + phoneNumber + ","+ city + "," + userId+")";
	}
	
}


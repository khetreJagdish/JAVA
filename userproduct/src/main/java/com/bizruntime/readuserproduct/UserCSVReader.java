package com.bizruntime.readuserproduct;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bizruntime.customexceptiom.UserFileNotFoundException;
import com.bizruntime.userproductpojo.User;
/**
 * <h1>UserCSVReader</h1> UserCSVReader is a simple class which
 * simply reads All the UserData from UserCSV file.
 * By using  the method getAllUsers() and return it as a List of User object.
 *
 * @author JK
 * @version 1.0
 * @since 2016-11-08
 * 
 */



public class UserCSVReader
{
	public static final String USERCSVFILE ="src/main/resources/User.csv";
	final String SPLITBY =",";
	//this method reads all the user from the user CSV file and return it as a List of User object
	public List<User> getAllUsers() throws  UserFileNotFoundException, IOException 
	{
		//System.out.println("from getAllUsers()");
		BufferedReader bufferreader = null;
		String line = "";
		List<User> list = new ArrayList<User>();
		
		try 
		{
			 bufferreader = new BufferedReader(new FileReader(USERCSVFILE));
			 while ((line = bufferreader.readLine()) != null) 
			 {
					 	String[] usercsvdata = line.split(SPLITBY);
					 	User usr = new User();
					 	usr.setUserId(usercsvdata[0]); 
					 	usr.setUserName(usercsvdata[1]);
					 	usr.setEmail(usercsvdata[2]);
					 	usr.setPhoneNumber(usercsvdata[3]);
					 	usr.setCity(usercsvdata[4]);
					
					 	list.add(usr);
			 			
			}
			 System.out.println(list);
			
	
		}
		catch (FileNotFoundException e) 
		{
			throw new UserFileNotFoundException("UserCSV File is not found in desired location", e);
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
		
		return list;

    }
	public static void main(String[] args) throws UserFileNotFoundException, IOException {
		UserCSVReader use = new UserCSVReader();
		use.getAllUsers();
	}
	
	
}

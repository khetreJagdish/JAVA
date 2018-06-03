package com.scoopen.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class CrunchifyGetPropertyValues {
	
	String result = "";
	InputStream inputStream;
	
	public String getPropValues() throws IOException {
		try {
			Properties properties = new Properties();
			String propFileName = "config.properties";
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			if (inputStream != null) {
				properties.load(inputStream);
			}
			else {
				throw new FileNotFoundException("Property file " + propFileName + " Not found in classpath");
			}
			
			Date time = new Date(System.currentTimeMillis());
			
			String user = properties.getProperty("user");
			String company1 = properties.getProperty("company1");
			String company2 = properties.getProperty("company2");
			String company3 = properties.getProperty("company3");
			
			result = "Company List = " + company1 + ", " + company2 + ", " + company3;
			System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
			
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}finally {
			inputStream.close();
		}
		return result;
	}
	
}

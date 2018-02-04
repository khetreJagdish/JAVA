package peopledata;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Util 
{
	public static Connection getConnection() throws Exception 
	{
		FileReader f1 = new FileReader("E:/BIZRUNTIME/XMLDEMO/peopledata/src/main/resources/constants.properties");
		Properties pr = new Properties();
		pr.load(f1);

		String s1 = pr.getProperty("className");
		String s2 = pr.getProperty("url");
		String s3 = pr.getProperty("username");
		String s4 = pr.getProperty("password");

		Class.forName(s1);
		Connection con = DriverManager.getConnection(s2,s3,s4);
		return con;
	}
}

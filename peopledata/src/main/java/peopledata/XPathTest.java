package peopledata;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class XPathTest 
{
	public static void main(String[] args) 
	{
		try {
			
			   DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			   DocumentBuilder builder = builderFactory.newDocumentBuilder();
			   
			   // Read the XML file
			   File inputFile = new File("E:/BIZRUNTIME/XMLDEMO/peopledata/src/main/resources/people.xml");
			   InputStream inputStream = new FileInputStream(inputFile);
			   
			   // Parse the XML file   
			   Document doc = builder.parse(inputStream);
			   
			   // Create an XPath instance
			   XPath xPath = XPathFactory.newInstance().newXPath();
		
			   String expression1 ="/people/person[@pan=' cdw345dgd']/firstName";
			   String firstName = xPath.evaluate(expression1, doc);
			   System.out.println(firstName);
			   System.out.println("inside try");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}

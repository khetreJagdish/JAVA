package com.bizruntime.accessxml;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.bizruntime.dbdao.DatabaseDAO;
import com.bizrutime.persondata.pojoclasses.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AccessXML 
{

	public static List<ArrayList> accessXML() 
	{
		List   listoflist = new ArrayList();
		
		Person personp =new Person();
		
		Address adrp = new Address();
		Company compp = new Company();

		try 
		{
			File istream = new File("E:/BIZRUNTIME/XMLDEMO/peopledata/src/main/resources/people.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document dbDoc = dbBuilder.parse(istream);
			dbDoc.getDocumentElement().normalize();

			
			NodeList nlist = dbDoc.getElementsByTagName("person");
			//System.out.println("-----------------" + nlist.getLength());

			for (int temp = 0; temp <nlist.getLength(); temp++) 
			{
			
				//System.out.println("***********"+temp);
				Node nd = nlist.item(temp);
				
				
				String pan = null;
				
				if(nd.getNodeType() == Node.ELEMENT_NODE)
				 {
					 
					 Element el = (Element) nd;
					 
				
				personp.setPan(el.getAttribute("pan"));
				
				personp.setNationality(el.getAttribute("nationality"));
				
				personp.setFirstname(el.getElementsByTagName("firstName").item(0).getTextContent());
				
				personp.setLastname(el.getElementsByTagName("lastName").item(0).getTextContent());
				
				personp.setAge(Integer.parseInt(el.getElementsByTagName("Age").item(0).getTextContent()));
				
				personp.setPhone(Long.parseLong(el.getElementsByTagName("phone").item(0).getTextContent()));
				
				//System.out.println(personp);
				
				
					for(int i =0; i <= temp; i++)
					{
							langkp.setLanguage1(el.getElementsByTagName("Language").item(0).getTextContent());
							langkp.setLanguage2(el.getElementsByTagName("Language").item(1).getTextContent());
							langkp.setLanguage3(el.getElementsByTagName("Language").item(2).getTextContent());
					}
			//	System.out.println(langkp);

				for(int i =0; i <= temp; i++)
				{
						
						adrp.setStreet(el.getElementsByTagName("Street").item(0).getTextContent());
						adrp.setStreet(el.getElementsByTagName("Street").item(0).getTextContent());
						adrp.setCity(el.getElementsByTagName("City").item(0).getTextContent());
						adrp.setPIN(Integer.parseInt(el.getElementsByTagName("PIN").item(0).getTextContent()));
						adrp.setState(el.getElementsByTagName("State").item(0).getTextContent());
						adrp.setCountry(el.getElementsByTagName("Country").item(0).getTextContent());
						
				}
						//System.out.println(adrp);
				
				 compp.setName(el.getElementsByTagName("Name").item(0).getTextContent());
				 compp.setLocation(el.getElementsByTagName("Location").item(0).getTextContent());
				compp.setDepartment(el.getElementsByTagName("Department").item(0).getTextContent());
				compp.setDesignation(el.getElementsByTagName("Degisgnation").item(0).getTextContent());
				compp.setCTC(Double.parseDouble(el.getElementsByTagName("CTC").item(0).getTextContent()));
				//System.out.println(compp);
				 
				 }
				 
//				 System.out.println(adrp);
//				 System.out.println(langkp);
//				 System.out.println(personp);
//				 System.out.println(compp);
				 listoflist.add(personp);
				 listoflist.add(adrp);
				 listoflist.add(compp);
				 
				 //System.out.println("------------------------------------");				 
			}
			DatabaseDAO.setPerson(singlepersonl);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return listoflist;
	}
	
	public static void main(String[] args) {
		AccessXML.accessXML();
	}
}

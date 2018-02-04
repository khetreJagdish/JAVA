package peopledata;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PeopleDBDAO 
{
	
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try 
		{
			File istream = new File("E:/BIZRUNTIME/XMLDEMO/peopledata/src/main/resources/people.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document dbDoc = dbBuilder.parse(istream);
			dbDoc.getDocumentElement().normalize();
			
			System.out.println("Root Element : \t "+ dbDoc.getDocumentElement().getNodeName());
			NodeList nlist = dbDoc.getElementsByTagName("person");
			System.out.println("-----------------");
			
			for (int temp = 0; temp < nlist.getLength(); temp++) 
			{
				//System.out.println(temp);
				Node nd = nlist.item(temp);
				System.out.println("Current Element : "+ nd.getNodeName());
				String pan=null;
				if(nd.getNodeType() == Node.ELEMENT_NODE)
				{
					Element el = (Element) nd;
				
					System.out.println("pan : " + el.getAttribute("pan"));
					System.out.println("nationality : "+ el.getAttribute("nationality"));
					System.out.println("First name : "+el.getElementsByTagName("firstName").item(0).getTextContent());
					System.out.println("Last Name : "+el.getElementsByTagName("lastName").item(0).getTextContent());
					System.out.println("Age : " + el.getElementsByTagName("Age").item(0).getTextContent());
					System.out.println("phone : "+ el.getElementsByTagName("phone").item(0).getTextContent());
					if(nd.getNodeType() == Node.ELEMENT_NODE)
					{
						System.out.println("LanguageKnown : " + el.getAttribute("Language"));
						System.out.println("\tLanguage :" + el.getElementsByTagName("Language").item(0).getTextContent());
						System.out.println("\tLanguage :" + el.getElementsByTagName("Language").item(1).getTextContent());
						System.out.println("\tLanguage :" + el.getElementsByTagName("Language").item(2).getTextContent());
					}
					if(nd.getNodeType() == Node.ELEMENT_NODE)
					{
						System.out.println("Addresess : " + el.getAttribute("Addresess"));
						System.out.println("\tStreet :" + el.getElementsByTagName("Street").item(0).getTextContent());
						System.out.println("\tCity :" + el.getElementsByTagName("City").item(0).getTextContent());
						System.out.println("\tPIN :" + el.getElementsByTagName("PIN").item(0).getTextContent());
						System.out.println("\tState :" + el.getElementsByTagName("State").item(0).getTextContent());
						System.out.println("\tCountry :" + el.getElementsByTagName("Country").item(0).getTextContent());
						System.out.println();
						
					}
					
					if(nd.getNodeType() == Node.ELEMENT_NODE)
					{
						System.out.println("CompanyInfo : " + el.getAttribute("CompanyInfo"));
						
						System.out.println("\tName :" + el.getElementsByTagName("Name").item(0).getTextContent());
						System.out.println("\tLocation :" + el.getElementsByTagName("Location").item(0).getTextContent());
						System.out.println("\tDepartment :" + el.getElementsByTagName("Department").item(0).getTextContent());
						System.out.println("\tDegisgnation :" + el.getElementsByTagName("Degisgnation").item(0).getTextContent());
						System.out.println("\tCTC :" + el.getElementsByTagName("CTC").item(0).getTextContent());
					}
					
					
					con= Util.getConnection();
					
					pstmt=con.prepareStatement("insert into Person values(?,?,?,?,?)");
					System.out.println("--------------------------"+el.getAttribute("pan"));
					pstmt.setString(1,(el.getAttribute("pan")));
					pstmt.setString(2,el.getElementsByTagName("firstName").item(0).getTextContent());
					pstmt.setString(3, el.getElementsByTagName("lastName").item(0).getTextContent());
					pstmt.setString(4, el.getElementsByTagName("Age").item(0).getTextContent());
					pstmt.setString(5, el.getElementsByTagName("phone").item(0).getTextContent());
					//pstmt.setString(6, el.getElementsByTagName("nationality").item(0).getTextContent());
			
					
				//	pstmt = con.prepareStatement("insert into Address values(?)")
				//pstmt.executeUpdate();
				
				
				pstmt.close();
				con.close();
					
				}
				
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

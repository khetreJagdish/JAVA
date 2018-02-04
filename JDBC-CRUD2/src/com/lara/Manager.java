package com.lara;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter id ");
	  Integer id = sc.nextInt();
	  System.out.println("enter first name ");
	  String firstName = sc.next();
	  System.out.println("enter age ");
	  Integer age = sc.nextInt();
	  System.out.println("enter house number " );
	 String houseNo = sc.next();
	 System.out.println("enter street name ");
	 String streetName = sc.next();
	 
	 ArrayList genders = PersonDAO.readAllGenders();
	 HashMap gender = null;
	 
	 for (Object record : genders) 
	 {
	   gender = (HashMap) record;
	   System.out.print("enter ");
	   System.out.print(gender.get("id"));
	   System.out.println(" for ");
	   System.out.println(gender.get("name"));
	}
   Integer genderId = sc.nextInt();
   
   ArrayList educations = PersonDAO.readAllEducation();
	 HashMap education = null;
	 
	 for (Object record : educations) 
	 {
		 education = (HashMap) record;
	   System.out.print("enter ");
	   System.out.print(education.get("id"));
	   System.out.println(" for ");
	   System.out.println(education.get("name"));
	}
 Integer educationId = sc.nextInt();
 
 
 System.out.println("available skills ");
 System.out.println("id \t  name ");
 ArrayList skills = PersonDAO.readAllSkills();
 HashMap skill = null;
 
 for (Object record : skills) 
 {
	skill = (HashMap) record;
   System.out.print(skill.get("id"));
   System.out.println(" \t ");
   System.out.println(skill.get("name"));
}
 System.out.println("Enter skill ids ");
 System.out.println("by using ,  as delimetor ");
 String skillStr = sc.next();
 String[] skillId = skillStr.split(",");
 
 HashMap data = new HashMap();
 data.put("id", id);
 data.put("firstName", firstName);
 data.put("age", age);
 data.put("genderId",genderId );
 data.put("educationId",educationId );
 data.put("skillId",skillId );
 data.put("houseNo",houseNo );
 data.put("streetName",streetName);
 
 PersonDAO.save(data);
 System.out.println("done");
 
 
	}

}

package com.lara;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manager 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   do
	   {
		   System.out.println("enter 1 for insertion ");
		   System.out.println("enter 2 for listing ");
		   System.out.println("enter 3 for searching ");
		   System.out.println("enter 4 for updating ");
		   System.out.println("enter 5 for deleting ");
		    int action = sc.nextInt();
		    
		    if(action == 1)
		    {
		    	save(sc);
		    }
	    else if(action == 2)
		    {
		    	list();
		    	
		    }
		    else if(action == 3)
		    {
		    	search(sc);
		    }
		    else if(action == 4)
		    {
		    	edit(sc);
		    }
		    else if(action == 5)
		    {
		    	delete(sc);
		    }
		    else
		    {
		    	System.out.println("Invalid Option");
		    }
		    System.out.println("Do you want to continue...");
	   }while("y".equals(sc.next()));
	   
   }
   
   
   private static  void save(Scanner sc) 
   {
	   System.out.print("enter id ");
	   int id = sc.nextInt();
	   
	   System.out.print("enter name ");
	   String name = sc.next();
	   
	   System.out.print("enter age ");
	   int age = sc.nextInt();
	   
	   System.out.println("enter email ");
	   String email = sc.next();
	   
	   PersonDAO.save(id, name, age, email);
	   
	   System.out.println("after  saving available records");
	   list();
	   System.out.println("do you want to insert one more (y/n) ");
	   
	   if("y".equals(sc.next()))
	   {
		   save(sc);
	   }
	   else
	   {
		   return;
	   }
   }
   
   private static void list() 
   {
	    ArrayList list  =  PersonDAO.readAllPersons();
	    Object[] row =  null;
	    if(list.size() > 0)
	    {
	    	System.out.println("Available records..");
	    	System.out.print("ID");
	    	System.out.print("\t NAME");
	    	System.out.print("\t AGE");
	    	System.out.println("\t EMAIL ");
	    
	    
	    
	    for (int i = 0; i < list.size(); i++) 
	    {
		    row = (Object[])	 list.get(i);
		    System.out.print(row[0]);
		    System.out.print("\t"+ row[1]);
		    System.out.print("\t"+ row[2]);
		    System.out.println("\t"+ row[3]);
		}
	  }
	    else
	    {
	 	   System.out.println("No records Available");
	    }
	    
   }
   

   private static void  search(Scanner sc)
   {
	    System.out.println("Enter search key ");
	    String key = sc.next();
	    ArrayList list = PersonDAO.readAllPersons(key);
	    
	    if (list.size() == 0) 
	    {
	    	
		   System.out.println("NO records to your ");
		   System.out.println("search with: "+key);
		}
	    else
	    {
	    	Object[] row =  null;
	    	for (int i = 0; i < list.size(); i++) 
		    {
			    row = (Object[])	 list.get(i);
			    System.out.print(row[0]);
			    System.out.print("\t"+ row[1]);
			    System.out.print("\t"+ row[2]);
			    System.out.println("\t"+ row[3]);
			}	
	    }
	    System.out.println("do you want  to ");
	    System.out.println("search again(y/n)?");
	    
	    if("y".equals(sc.next()))
	    {
	    	search(sc);
	    }
	    else
	    {
	    	return;
	    }
	    
   }
   
   private static void edit(Scanner sc) 
   {
	    
	    list();
	    if(PersonDAO.readAllPersons().size() > 0)
	    {
	    System.out.print("enter id of the record whic you want to edit...");
	    
	    int id = sc.nextInt();
	    Object[] record = PersonDAO.readPersons(id);
	    String name = (String) record[1];
	    Integer age = (Integer) record[2];
	    String email = (String) record[3];
	    System.out.println("detailed account :");
	    System.out.println("name: "+ name);
	    System.out.println("age:"+ age);
	    System.out.println("email :"+ email);
	    
	    System.out.println("you want to modify name(y/n)?");
	    if("y".equals(sc.next()))
	    {
	    	System.out.println("enter new name");
	    	name = sc.next();
	    }
	    System.out.println("you want to modify age(y/n)?");
	    if("y".equals(sc.nextInt()))
	    {
	    	System.out.println("enter new age");
	    	age = sc.nextInt();
	    }
	    System.out.println("you want to modify email(y/n)?");
	    if("y".equals(sc.next()))
	    {
	    	System.out.println("enter new email");
	    	email = sc.next();
	    }
	    PersonDAO.update(id, name, age, email);
	    System.out.println("after updation ");
	    System.out.println("list of records ");
	    list();
	    System.out.println("do you want to update one more record (y/n)");
	    if("y".equals(sc.next()))
	    {
	    	edit(sc);
	    }
	    else
	    {
	    	return;
	    }
	  }
	    
   }
   private static void delete(Scanner sc) 
   {
        	 
        	 
     	    list();
     	   if(PersonDAO.readAllPersons().size() > 0)
   	    {
     	    
     	    int id = sc.nextInt();
     	    Object[] record = PersonDAO.readPersons(id);
     	    String name = (String) record[1];
     	    Integer age = (Integer) record[2];
     	    String email = (String) record[3];
     	    System.out.println("detailed account :");
     	    System.out.println("name: "+ name);
     	    System.out.println("age:"+ age);
     	    System.out.println("email :"+ email);
     	    
     	    System.out.println("confirm the delete(y/n)?");
     	    if("y".equals(sc.next()))
     	    {
     	    	PersonDAO.delete(id);
     	    	System.out.println("after delete");
     	    	
     	    	list();
     	    }
     	    System.out.println("do you want to delete one more(y/n)?");
     	    if("y".equals(sc.next()))
     	    {
     	    	delete(sc);
     	    }
     	    else
     	    {
     	    	return;
     	    }
   	    } 
   }
}

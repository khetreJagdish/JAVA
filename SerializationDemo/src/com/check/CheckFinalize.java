package com.check; // Package is different 
public class CheckFinalize{
         public void finalize(){  //can't be declared protected if 
                 //it is public in Object class
                System.out.println("Check Finalize");
                //code to close connection for our class
        }
         public void update(){
                // code to update data at connection
        }
} 



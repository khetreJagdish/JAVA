package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class SerializationTest1 {
		
	 
	
	
	public static void main(String[] args) {
			
			File file = new File("test.ser");
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(new Customer(101, "Sam"));
				objectOutputStream.flush();
				objectOutputStream.close();
				
				
				
				
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				System.out.println("Debugging");
				try {
					
					System.out.println("Customer");
					System.out.println((Customer)objectInputStream.readObject());
					
					
					PrintStream printStream = new PrintStream(file);
					
					//printStream.println(customer);
					//System.out.println(customer);
					objectInputStream.close();
					printStream.close();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				catch (NullPointerException e) {
					System.out.println("Nullpointer Exception is occurred");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
}

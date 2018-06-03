package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
			
		File file = new File("test.ser");
		Customer customer = new Customer(101, "Jagdish");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(customer);
			//objectOutputStream.close();
			System.out.println("Object successfully written in the Specified file. " );
			System.out.println(customer);
		
		
		
		
			System.out.println("Deserializtion");
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println("fileInputStream  "+fileInputStream );
			ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
			System.out.println("objectInputStream  "+objectInputStream );
			Customer customer2 =(Customer)objectInputStream.readObject();
			//objectInputStream.close();
			System.out.println("Object successfully written in the Specified file. " );
			System.out.println(customer);
		
	}
}

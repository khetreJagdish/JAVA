package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo1{
	
	public static void main(String[] args) {
		
		File file = new File("test2.ser");
		
		Dog dog = new Dog(10,20);
		try {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(dog);
		System.out.print("Serialization :");
		System.out.println(dog);
		
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Dog dog2 = (Dog)inputStream.readObject();
		System.out.print("De-Serialization :");
		System.out.println(dog2);
		
		}catch (Exception e) {
		}
		
		
		
		
	}
	
}
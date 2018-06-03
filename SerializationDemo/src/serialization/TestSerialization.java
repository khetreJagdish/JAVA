package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	
	public int a;
	public String b;
	
	public Demo(int a, String b){
		this.a = a;
		this.b = b;
	}

}

public class TestSerialization{
	
	public static void main(String[] args) {
		
		Demo object = new Demo(1,"geeksforgeeks");
		String fileName = "file.ser";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(object);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Object has been serialized");
		} catch (IOException e) {
			
			System.out.println("IOException is caught");
		}
		
		Demo object1 = null;
		
		
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    object1 = (Demo)objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			System.out.println("Object has been deserialized");
			System.out.println("a : " + object1.a);
			System.out.println("b : " + object1.b);
			
		} catch (IOException  e) {
			
			System.out.println("IOException");
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		}
		
	}
	
}

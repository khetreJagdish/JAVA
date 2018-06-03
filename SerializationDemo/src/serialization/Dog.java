package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	
	final int i = 10;
	int j = 20;
	
	public Dog(int i , int j) {
		//this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Dog [i=" + i + ", j=" + j + "]";
	}
	
	
	
}




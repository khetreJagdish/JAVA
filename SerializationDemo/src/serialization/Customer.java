package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Customer  implements Serializable{
	
	private static final long serialVersionUID =1L;
	 transient Integer customerID;
	//final transient String customerName ;
	static String customerName ;
	
	public Customer(Integer customerID, String customerName) {
	
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	
	private void writeObject(ObjectOutputStream outputStream) throws IOException
	{
			outputStream.defaultWriteObject();
			this.customerID = customerID +2;
			outputStream.writeInt(customerID);
	}
	
	private void readObject(ObjectInputStream inputStream) throws  Exception
	{
		
		inputStream.defaultReadObject();
		//System.out.println("InputStream : =======" + t);
		int custId = this.customerID-2;
		System.out.println(inputStream.readInt());
				
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + "]";
	}
	
	
	
}

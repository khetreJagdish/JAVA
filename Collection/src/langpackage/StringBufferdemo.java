package langpackage;

public class StringBufferdemo {
	
		public static void main(String[] args) {
			
			StringBuffer stringBuffer = new StringBuffer();
			System.out.println("Capacity : " + stringBuffer.capacity());
			stringBuffer.reverse();
			stringBuffer.append(true);
			stringBuffer.reverse();
			stringBuffer.append(5);
			int lenght = stringBuffer.length();
			System.out.println("From StringBuffer :  "+stringBuffer + " Length : " + lenght + " Capacity " + stringBuffer.capacity());
			
			
			
			
			StringBuilder stringBuilder = new StringBuilder("Hello");
			stringBuilder.reverse();
			
			System.out.println("From StringBuilder : " + stringBuilder + " StringBuilder Capacity : " + stringBuilder.capacity());
		}
}

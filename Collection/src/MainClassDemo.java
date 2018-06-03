public class MainClassDemo{
	public static void main(String[] args) {
		SuperClass1 class1 = new SubClass2();
		class1 = null;
		class1.method();// method will get called
	}
}
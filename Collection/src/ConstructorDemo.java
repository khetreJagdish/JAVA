import java.util.IdentityHashMap;

class Exam
{

	static String demo ; 
	public Exam(String hello) {
		this.demo = hello;
		
		System.out.println("From Super of hello " + demo);
	}
	
	public Exam() {
		this(null);
	}
	
	static void fromExam()
	{
		System.out.println("From Exam Super class ");
	}
	
}
public class ConstructorDemo extends Exam {

		private static Object string = "string";
		private static String hello = "Hello";


		public ConstructorDemo() {
			super(hello);
			System.out.println("From sub of String " + string);
			
		}
		
		void printHello()
		{
			super.fromExam();
			System.out.println("From method ");
		}
		
		

	public static void main(String[] args) {
		
		
		ConstructorDemo constructorDemo = new ConstructorDemo();
		constructorDemo.printHello();
		System.out.println(constructorDemo.getClass().getClassLoader());
		
	}

}

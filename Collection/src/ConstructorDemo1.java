class Superclass
{
	public Superclass() {
		System.out.println("From Super class");
	}
}
public class ConstructorDemo1 extends Superclass{
	int i ;
	public ConstructorDemo1() 
	{
		
		
	}
	
	
	public ConstructorDemo1(int i) 
	{
		//super();
		this.i = i;
		System.out.println("From Param Constructor "  + i);
	}
	public static void main(String[] args) {

//ConstructorDemo1 constructorDemo1 = new ConstructorDemo1();
	System.out.println(true & true); // false
	System.out.println(false | false);// true
	System.out.println(false ^ false);
	System.out.println(4 & 5);
	System.out.println(~4);
	}

}

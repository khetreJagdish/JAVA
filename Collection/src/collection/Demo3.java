package collection;

public class Demo3 {
	public static void main(String[] args) {
		Demo3 demo3= new Demo3();
		//System.out.println(demo3.function());
		int cnt = 10;
		if(cnt == 30 && cnt/0==10){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	private String function() {
		return ("1");
	}
	public final static String function(int data) {
		return("2");
	}
}

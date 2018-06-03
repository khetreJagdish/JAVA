import java.util.HashSet;

public class Snippet {
	public static void main(String[] args) {
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 1000; i++) {
		shortSet.add(i);
		shortSet.remove(i - 2);
		}
		System.out.println(shortSet.size());	
	}
	
}
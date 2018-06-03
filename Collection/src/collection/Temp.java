package collection;

public class Temp {
		
	int i ;
	public Temp(int i) {
		this.i = i;
		
	}
	
	@Override
	public int hashCode() {
		
		return i;
	}
	@Override
	public String toString() {
		
		return i + " ";
	}
}

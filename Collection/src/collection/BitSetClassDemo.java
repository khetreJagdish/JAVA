package collection;

import java.util.BitSet;

public  class BitSetClassDemo {
	
	public static void main(String[] args) {
		
		BitSet bitSet = new BitSet();
		int[] array = {1,5,6,7,8,3,1,9,10,45,12};
		
		for (int i : array) {
			bitSet.set(i);
		}
		bitSet.and(bitSet);
		System.out.println(bitSet);
		
		
	}

	
	
}

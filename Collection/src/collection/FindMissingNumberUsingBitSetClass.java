package collection;

import java.util.BitSet;

public class FindMissingNumberUsingBitSetClass {
	
	public static void main(String[] args) {
		
		BitSet bitSet = new BitSet(10);
		bitSet.set(2);
		bitSet.set(3);
		System.out.println("BitSet  : " + bitSet.length());
		System.out.println(bitSet.get(2));
	}
}

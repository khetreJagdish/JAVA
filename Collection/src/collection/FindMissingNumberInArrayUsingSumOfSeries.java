package collection;

public class FindMissingNumberInArrayUsingSumOfSeries
{
	
	public static void main(String[] args) {
		int[] array1 = new int[] {1,2,3,4,6,7};
	
		System.out.println("Given Array is : " );
		for (int i : array1) {
			System.out.print(i + " ");
		}
		// worked for only one Missing Number
		int missingNumber = findMissingNumber(array1 , 7);
		System.out.println("Missing Number is : " + missingNumber);
	}

	private static int findMissingNumber(int[] array1, int i) {
		int expectedSum = (i * (i+1)/2);
		int actualTotal = 0;
		
		for (int j : array1) {
			actualTotal += j;
		}
		return expectedSum - actualTotal;
		
	}
}

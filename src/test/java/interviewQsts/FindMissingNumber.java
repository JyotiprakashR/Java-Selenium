package interviewQsts;

import edu.emory.mathcs.backport.java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		/*
		 * System.out.println("abc".length()); char c[]= {'a', 'b', 'c'};
		 * System.out.println(c.length);
		 */
		
		System.out.println(fidMissingNum(1,2,3,5,6));
		System.out.println(fidMissingNum(4,2,1,5,6));
		System.out.println(fidMissingNum(108,109,105,104,102,103,101,107));

		
	}
	
	public static int fidMissingNum(int... intArr) {
		// the array should be sorted before searching
		int sumOfGivenArray=0;
		int sumOfActualArray=0;
		
		Arrays.sort(intArr);
		for(int i=0; i<intArr.length; i++) {
			sumOfGivenArray=sumOfGivenArray+intArr[i];
		}
		
		int firstInt=intArr[0];
		int lastInt=intArr[intArr.length-1];
		for(int j=firstInt; j<=lastInt; j++) {
			sumOfActualArray=sumOfActualArray+j;
		}
		
		return sumOfActualArray-sumOfGivenArray;
		
	}

}

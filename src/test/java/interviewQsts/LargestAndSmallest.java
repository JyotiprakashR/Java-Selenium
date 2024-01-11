package interviewQsts;

public class LargestAndSmallest {

	public static void main(String[] args) {
		largeSmall(12, 01, 45, 36, 9, 58);

	}

	public static void largeSmall(int... intArray) {
		int largest = intArray[0];
		int smallest = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > largest) {
				largest = intArray[i];
			} else if (intArray[i] < smallest) {
				smallest = intArray[i];
			}

		}
		System.out.println("largest--" + largest + " :: " + "smallest--" + smallest);

	}

}

package hackerRank;

public class FormattedString {

	public static void main(String[] args) {

//		Sample Input
//		java 100
//		cpp 65
//		python 50

//		Sample Output
//		================================
//		java		   100 
//		cpp            065 
//		python         050 
//		================================
		
		System.out.println("================================");
		System.out.printf("java\n");
		System.out.printf("java" ,"%15s %n", "baeldung");

		
		System.out.println("================================");
	}

}

package interviewQsts;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		try (s) {
//			int myInt = s.nextInt();
//			int myInt1 = s.nextInt();
//			int myInt2 = s.nextInt();
//			System.out.println(myInt);
//			System.out.println(myInt1);
//			System.out.println(myInt2);
//		}

//		42
//		3.1415
//		Welcome to HackerRank's Java tutorials!

		Scanner sc = new Scanner(System.in);
		try (sc) {
			int myInt = Integer.parseInt(sc.nextLine()); 
			double myDouble = Double.parseDouble(sc.nextLine());
			String myString = sc.nextLine();
			System.out.println("String: " + myString);
			System.out.println("Double: " + myDouble);
			System.out.println("Int: " + myInt);

		}

	}

}

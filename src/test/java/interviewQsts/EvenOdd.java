package interviewQsts;

public class EvenOdd {

	public static void main(String[] args) {

		isEvenOrOdd(0);
		isEvenOrOdd(3);
		isEvenOrOdd(20);

	}

	public static void isEvenOrOdd(int num) {
		if (num % 2 == 0) {
			if (num > 2 && num < 5) {
				System.out.println("Not Weird");
			} else if (num > 6 && num <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
	}

}

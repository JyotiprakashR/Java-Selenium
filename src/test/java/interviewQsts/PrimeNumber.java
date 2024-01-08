package interviewQsts;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(4));
		System.out.println(isPrime(17));
		System.out.println(isPrime(0));
		System.out.println(isPrime(13));

	}

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		/*
		 * for (int i = 2; i < number; i++) { if (number % i == 0) { return false; } }
		 */
		else if (number % 2 == 0) {
			return false;
		}
		return true;

	}

}

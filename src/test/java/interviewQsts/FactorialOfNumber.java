package interviewQsts;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println(findFactorial(3));
		System.out.println(findFactorial(1));
		System.out.println(findFactorial(0));
		System.out.println(findFactorial(5));
		System.out.println(findFactorial(-1));
		
		System.out.println(0.0/0.0);
	}

	public static int findFactorial(int num) {

		if(num==0 || num==1) {
			return 1;
		}
		int fact = 1;
//		int i = 1;
//		while (i <= num) {
//			fact = fact * i;
//			i++;
//		}
		
		for(int j=1; j<=num; j++) {
			fact=fact*j;
		}
		return fact;

	}

}

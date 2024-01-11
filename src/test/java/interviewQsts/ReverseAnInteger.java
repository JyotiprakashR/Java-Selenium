package interviewQsts;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(i / 2); // 2 --quotaint
		System.out.println(i % 2); // 1 --Remainder
		
		System.out.println(reverseInteger(121));
	}

	public static int reverseInteger(int integer) {
		// 121
		int num=0;
		while (integer > 0) {
			int remainder = integer % 10;
			num=(num*10)+remainder;
			integer=integer/10;
		}
		return num;
	}

}

package interviewQsts;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// If a number is as equal, while reading from last..i.e. called Palindrome number
		
		System.out.println(isPalindrome(151));
		System.out.println(isPalindrome(124));
		System.out.println(isPalindrome(152));
	}
	
	public static boolean isPalindrome(int num) {
		//121
		int numCopy=num;
		int num1=0;
		while(num>0) {
			int rem=num%10;
			num1=(num1*10)+rem;
			num=num/10;
		}if(numCopy==num1)
			return true;
		return false;
	}

}

